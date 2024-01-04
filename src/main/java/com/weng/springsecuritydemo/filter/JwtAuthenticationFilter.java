package com.weng.springsecuritydemo.filter;

import com.weng.springsecuritydemo.utils.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter
{
    private final JwtUtil jwtUtil;
    private final UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException
    {
        final String authHeader = request.getHeader("Authorization");
        if (authHeader == null ||!authHeader.startsWith("Bearer "))
        {
            filterChain.doFilter(request, response);
            System.out.println(SecurityContextHolder.getContext().getAuthentication());
            return;
        }
        final String token=authHeader.substring(7);
        String username = jwtUtil.extractUsername(token);//解析的时候会自动判断是否过期
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null)
        {
            //解析token得到用户名后，查找数据库，看是否存在此用户
            //loadUserByUsername查到的数据库中的用户名和token中的用户名肯定一致，所以不需要isValid判断
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            //保存到上下文中
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
                    = new UsernamePasswordAuthenticationToken(
                            userDetails, null, userDetails.getAuthorities());
            usernamePasswordAuthenticationToken.setDetails(
                    new WebAuthenticationDetailsSource().buildDetails(request)
            );
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
        }
        filterChain.doFilter(request, response);
    }
}

package com.weng.springsecuritydemo.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RoleEnumTest
{
    @Test
    public void testRoleEnum()
    {
        RoleEnum roleEnum = RoleEnum.valueOf("ADMIN");
        System.out.println(roleEnum.name());
        System.out.println(roleEnum.toString());
        System.out.println(roleEnum.ordinal());
        System.out.println(RoleEnum.values()[0]);
        System.out.println(RoleEnum.values()[1]);

    }

}
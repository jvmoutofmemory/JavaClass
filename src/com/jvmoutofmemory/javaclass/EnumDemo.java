package com.jvmoutofmemory.javaclass;

/**
 *
 * 枚举演示
 *
 * @author adam
 *
 */
public class EnumDemo {

    enum Season {spring, summer, fall, winter};


    public static void main(String[] args) {

        Season s1;
        Season s2;

        s1 = Season.spring;
        s2 = Season.winter;

        System.out.println("s1 name is :" + s1.name());
        System.out.println("s1 value is :" + s1);
        System.out.println("s1 order is :" + s1.ordinal());

        System.out.println("=======================");


        System.out.println("s2 name is : " + s2.name());
        System.out.println("s2 value is :" + s2);
        System.out.println("s2 order is : " + s2.ordinal());

    }


}

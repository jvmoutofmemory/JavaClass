package com.jvmoutofmemory.javaclass;

/**
 * 自动装箱、拆箱演示
 */
public class BoxingDemo {

    public static void main(String[] args) {

        Integer obj1 = null;
        int num1 = 20;

        obj1 = num1;

        System.out.println("obj1 is : " + obj1 + ", num1 is : " + num1);

        Integer obj2 = 30;

        System.out.println("obj2 is: " + obj2);



        int num2 = obj2;
        System.out.println("num2 is : " + num2);

        Float num3 = 40.0F;

        System.out.println("num3 is : " + num3);

    }

}

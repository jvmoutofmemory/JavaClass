package com.jvmoutofmemory.javaclass;

/**
 * Math 求解一元二次方程的根
 */
public class MathDemo {

    public static void main(String[] args) {

        int a = 3;
        int b = 8;
        int c = 4;


        double sqrt = Math.sqrt(b * b - 4 * a * c);
        sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        double result1 = (-1 * b + sqrt) / (2 * a);
        double result2 = (-1 * b - sqrt) / (2 * a);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println(((-1 * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)));// 不推荐
    }

}

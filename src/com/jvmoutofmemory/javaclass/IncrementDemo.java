package com.jvmoutofmemory.javaclass;

public class IncrementDemo {

    public static void main(String[] args) {

        int count = 15;
        int total;

        total = count++;

        System.out.println(count);
        System.out.println(total);

        count = 15;

        total = ++count;

        System.out.println(count);
        System.out.println(total);

        System.out.println("=====");

        total = 4;
        total *= 3;
        System.out.println(total);

        total = 4;

        total *= 3 + 5;

        System.out.println(total);


    }
}

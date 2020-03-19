package com.jvmoutofmemory.javaclass;

import java.util.Scanner;

/**
 * Scanner 方法
 */
public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner;

        scanner = new Scanner(System.in);


        String name;
        int age;

        System.out.println("please input your name: ");
        name = scanner.nextLine();

        System.out.println("please input your age: ");
        age = scanner.nextInt();

        System.out.println("I am " + name + ", I am " + age + " years old !");

    }


}

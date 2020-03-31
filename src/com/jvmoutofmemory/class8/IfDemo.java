package com.jvmoutofmemory.class8;

import java.util.Scanner;

public class IfDemo {

    private static final int RATIO = 18;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您的年龄:");

        int age = scanner.nextInt();

        if (age < RATIO) {
            System.out.println("您是未生年人!");
            System.out.println("好好上学，天天向上");
        }

        if (age >= RATIO) {
            System.out.println("您是成年人!");
            System.out.println("好好工作");
        }

        System.out.println("程序执行结束");

    }

}

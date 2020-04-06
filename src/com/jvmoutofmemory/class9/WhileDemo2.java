package com.jvmoutofmemory.class9;

import java.util.Scanner;

public class WhileDemo2 {

    static final int FINISH_FLAG = 0;

    public static void main(String[] args) {

//        doReCycle();


        //和
        int sum = 0;
        //用户输入的次数
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("输入数值，计算和与平均值，0退出程序:");
        int input = scanner.nextInt();

        while (input != FINISH_FLAG) {
            sum = sum + input;
            count++;

            System.out.println("和： " + sum + ", 平均值: " + ((double)sum / count));

            System.out.println("输入数值，计算和与平均值，0退出程序:");
            input = scanner.nextInt();
        }
    }


    private static void doReCycle() {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        do {
            System.out.println("输入数值，计算和与平均值，0退出程序:");
            input = scanner.nextInt();
            if (input == FINISH_FLAG) {
                break;
            }

            sum = sum + input;
            count++;

            System.out.println("和： " + sum + ", 平均值: " + ((double)sum / count));

        } while (true);


    }

}

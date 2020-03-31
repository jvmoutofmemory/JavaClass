package com.jvmoutofmemory.class8;

import java.util.Scanner;

public class MaxNumberDemo {

    /**
     * 求最大值
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public int max(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数:");
        int num1 = scanner.nextInt();

        System.out.println("输入第二个数:");
        int num2 = scanner.nextInt();

        System.out.println("输入第三个数:");
        int num3 = scanner.nextInt();

        MaxNumberDemo demo = new MaxNumberDemo();
        int maxNumber = demo.max(num1, num2, num3);

        System.out.println("最大值是: " + maxNumber);



        if (num1 > num2)
            if (num1 > num3)
                System.out.println("max number is num1");
            else
                System.out.println("max number is num3");
        else
            System.out.println("aa");

    }

}

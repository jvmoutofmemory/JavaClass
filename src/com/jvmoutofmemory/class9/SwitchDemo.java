package com.jvmoutofmemory.class9;

import java.util.Scanner;

/**
 * switch demo
 */
public class SwitchDemo {


    public static void main(String[] args) {

        String flag = null;

        int a = 0;
        int b = 0, c = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入字符串:");

        flag = scanner.nextLine();

        switch (flag) {
            case "A":
                a++;
            case "B":
                b++;
                break;
            case "C":
                c++;
                break;
            default:
                System.out.println("No case matched flag " + flag);
        }

        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

    }


}

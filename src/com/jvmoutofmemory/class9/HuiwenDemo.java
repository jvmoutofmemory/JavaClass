package com.jvmoutofmemory.class9;

import java.util.Scanner;

/**
 * 回文序列测试：
 *
 *  1. 正序和倒序都相同的字符串，是回文序列
 *  2. abcba，  abccba
 *  3. abc ba
 *
 */
public class HuiwenDemo {

    static final String FINISH_FLAG = "N";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String isContinue = "Y";
        while (!isContinue.equalsIgnoreCase(FINISH_FLAG)) {

            System.out.println("请输入要测试的字符串: ");

            //用户输入的字符串
            String input = scanner.nextLine();
            //字符串第一个字符的索引位置
            int left = 0,
                    //字符串最后一个字符的索引位置
                    right = input.length() - 1;

            while (input.charAt(left) == input.charAt(right) && left <= right) {
                left++;
                right--;
            }

            if (left <= right) {
                System.out.println("不是回文序列!");
            } else {
                System.out.println("是回文序列!");
            }

            System.out.println("是否继续测试(Y/N)? ");
            isContinue = scanner.nextLine();
        }


    }

}

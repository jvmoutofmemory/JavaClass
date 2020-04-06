package com.jvmoutofmemory.class9;

public class WhileDemo1 {

    public static void main(String[] args) {

        int count = 6;
//        while (count < 19) {
        while (count <= 18) {
            System.out.println(count);
            count++;
        }

        System.out.println("程序执行结束");

    }

}

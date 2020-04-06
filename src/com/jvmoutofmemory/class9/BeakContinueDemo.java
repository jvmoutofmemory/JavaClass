package com.jvmoutofmemory.class9;

public class BeakContinueDemo {

    public static void main(String[] args) {

        int i = 0,
                //循环执行的次数
                j = 0;

        while (i < 10) {
            i++;
            if (i==3 ) {
                continue;
            }

            if (i == 5) {
                break;
            }

            j++;
            System.out.println("循环执行次数:" + j + ", i = " + i);
        }
    }

}

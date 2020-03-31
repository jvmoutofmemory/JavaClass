package com.jvmoutofmemory.class8;

import java.util.Scanner;

public class SalaryDemo {

    /**
     * 每周标准工时
     */
    private static final int STANDARD_HOURS = 40;

    /**
     * 标准时薪（元）
     */
    private static final int STANDARD_SALARY = 50;

    /**
     * 加班的工时的时薪倍率
     */
    private static final double ADDITIONAL_SALARY_RATE = 1.5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您的本周总工时:");

        int totalHours = scanner.nextInt();

        double totalSalary = 0;

        if (totalHours <= STANDARD_HOURS) {
            totalSalary = totalHours * STANDARD_SALARY;
        } else {
            int additionalHours = totalHours - STANDARD_HOURS;
            /**
             *
             * 一周工作了45小时，
             * 薪资= 40 * 50 + 5 * 50 * 1.5
             *
             */
            totalSalary = STANDARD_SALARY * STANDARD_HOURS + additionalHours * STANDARD_SALARY * ADDITIONAL_SALARY_RATE;
        }


        System.out.println("您的工资是： " + totalSalary);

    }

}

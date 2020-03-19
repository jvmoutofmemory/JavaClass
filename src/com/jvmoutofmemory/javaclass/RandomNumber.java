package com.jvmoutofmemory.javaclass; //声明包名

//导入外部类
import java.util.Random;

/**
 * 测试 Random 类的方法
 */

// 类的声明
public class RandomNumber {

    /**
     * 类属性（类成员）声明
     */
    private int number;

    /**
     *  类的方法
     */
    public int getNumber() {
        return number;
    }

    /**
     * 类的方法
     */
    public void setNumber(int number) {
        this.number = number;
    }

    // 程序执行入口
    public static void main(String[] args) {

        // 创建实例
        RandomNumber randomNumber = new RandomNumber();
        Random random = new Random();

        randomNumber.setNumber(random.nextInt());

        System.out.println(randomNumber.getNumber());

    }
}
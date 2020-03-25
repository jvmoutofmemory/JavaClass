package com.jvmoutofmemory.javaclass;

/**
 *
 * @since 1.0
 * @see Student
 * @see com.jvmoutofmemory.javaclass.Student
 * @see com.jvmoutofmemory.javaclass.Student#setName(String)
 *
 * {@link Student}
 *
 * @author adam
 */
public class MethodDemo {

    private String name;

    private int age;

    public MethodDemo() {

    }

    /**
     *
     * @param name 名称
     * @param age 年龄
     */
    public MethodDemo(String name, int age) {
        this(name);
        this.age = age;
    }

    public MethodDemo(String name) {
        this.name = name;
    }

    /**
     *
     * @param num1 参数1
     * @param num2 参数2
     * @return 返回两者值的和
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return this.sum(num1, num2) + num3;
    }

    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();
        int sum = demo.sum(4,6,10);
        System.out.println(sum);

    }

}

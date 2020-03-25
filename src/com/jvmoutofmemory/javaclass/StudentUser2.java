package com.jvmoutofmemory.javaclass;

public class StudentUser2 {

    public static void main(String[] args) {

        Student luban = new Student();
        luban.setName("鲁班");

        Student huamulan = new Student();
        huamulan.setName("花木兰");

        System.out.println("花木兰: " + huamulan.getName());
        System.out.println("鲁班: " + luban.getName());

        System.out.println("花木兰: " + huamulan);
        System.out.println("鲁班: " + luban);

        Student.school = "实验小学";

        System.out.println("花木兰: " + huamulan);
        System.out.println("鲁班: " + luban);
    }

}

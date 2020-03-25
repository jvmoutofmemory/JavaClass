package com.jvmoutofmemory.javaclass;

public class Student {

    public static String school;

    private String number;

    private String name;

    String address;

    protected String major;

    public int age;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setNumber(String number, String name) {

    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        setAddress(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public static String getSchool() {
        return school;
    }

    public String toString() {
        return name + ", " + school;
    }
}

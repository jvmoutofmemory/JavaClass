package com.jvmoutofmemory.class8;

public class StringEqualDemo {

    public static void main(String[] args) {

        String name1 = "jim";
        String name2 = "jim";

        if (name1 == name2) {
            System.out.println("names are same by ==");
        } else {
            System.out.println("names are different  by ==");
        }


        if (name1.equals(name2)) {
            System.out.println("names are same by equals");
        } else {
            System.out.println("names are different by equals");
        }


    }

}

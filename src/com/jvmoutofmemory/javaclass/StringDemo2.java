package com.jvmoutofmemory.javaclass;

/**
 * String 方法演示
 */
public class StringDemo2 {

    public static void main(String[] args) {

        String address = "北京";

        char first = address.charAt(0);
        System.out.println(first);


        String second = "the brown fox";
        String third = "jumped over the lazy dog";

        System.out.println(second.compareTo(third));

        System.out.println(second.equals(third));

        String forth = "The brown Fox";

        System.out.println(second.equals(forth));
        System.out.println(second.equalsIgnoreCase(forth));

        second = "the brown fox";
        System.out.println(second.replace("fox", "dog"));
        System.out.println(second.substring(3, 6));// 3-5,   br


    }

}

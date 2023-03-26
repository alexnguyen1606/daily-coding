package com.lunar_2023;

/**
 * @author: Nguyen Anh Tuan
 * @created: 2/8/2023
 */

public class Student {

    private String name;
    private Integer age;

    static Integer count = 0;

    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        student.count++;
        student2.count++;
        Student.count = 10;

        student.count = 11;
    }

    public static class Integer2 {
        //inner class <=> static class

    }

}

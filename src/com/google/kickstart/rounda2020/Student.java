package com.google.kickstart.rounda2020;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:47 PM ,December 29,2020
 */
public class Student implements Comparable<Student> {
    private int age;
    private String name;
    
    @Override
    public int compareTo(Student o) {
        String[] first = this.name.split(" ");
        String name = first[first.length - 1];
        String[] seconde = o.name.split(" ");
        String name2 = seconde[seconde.length - 1];
        return name2.compareTo(name);
    }
}

package com.leetcode.data_struct.linkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:10 AM ,November 27,2020
 */
public class Person {

  private String name;

  private Integer age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void printNameAndAge() {
    System.out.println("Name :" + name);
    System.out.println("Age: " + age);
  }
}

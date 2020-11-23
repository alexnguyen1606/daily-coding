package com.leetcode.designparttern.factorymethod;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:08 PM ,November 16,2020
 */
public class Excersice25 {
    private void printInPrivate(String name){
    System.out.println("Private Access "+name);
    }
    protected void printInProtected(){
    System.out.println("Protected Access");
    }
    
    void printPackage(){
    System.out.println("Package Access");
    }
}

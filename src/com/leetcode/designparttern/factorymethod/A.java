package com.leetcode.designparttern.factorymethod;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * September 14,2020
 */
public class A {
    public U createU(){
        return new U() {
            @Override
            public void create() {

            }

            @Override
            public void update() {

            }

            @Override
            public void delete() {

            }
        };
    }
}

package com.leetcode.designparttern.factorymethod.demo;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 11,2020
 */
public class ServiceImpl2 implements Service {
  @Override
  public void method1() {
    System.out.println("Service impl2,1");
  }

  @Override
  public void method2() {
    System.out.println("Service impl2,2");
  }
  private ServiceImpl2(){

  }
  public static FactoryService factory = new FactoryService() {
    @Override
    public Service getService() {
      return new ServiceImpl2();
    }
  };
}

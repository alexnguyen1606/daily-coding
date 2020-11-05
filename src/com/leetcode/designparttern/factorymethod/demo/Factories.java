package com.leetcode.designparttern.factorymethod.demo;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 11,2020
 */
public class Factories {
  public Service service;

  public Service serviceConsumer(FactoryService factoryService) {
    this.service = factoryService.getService();
    return this.service;
  }

  public static void main(String[] args) {
    Factories factories = new Factories();
    Service service = factories.serviceConsumer(ServiceImpl1.factory);
    service.method1();
    service =factories.serviceConsumer(ServiceImpl2.factory);
    service.method1();
  }
}

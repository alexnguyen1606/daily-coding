package com.designpattern.factorymethod;

import com.designpattern.factorymethod.cycle.Cycle;
import com.designpattern.factorymethod.cycle.CycleFactory;
import com.designpattern.factorymethod.demo.FactoryService;
import com.designpattern.factorymethod.demo.Service;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 11,2020
 */
public class Factories {
  private Cycle cycle;

  public static void serviceConsumer(FactoryService factoryService) {
    Service service = factoryService.getService();
    service.method1();
    service.method2();
    
  }

  public Factories(CycleFactory cycleFactory) {
    this.cycle = cycleFactory.getCycle();
  }

  public void setCycleFactory(CycleFactory cycleFactory) {
    cycle = cycleFactory.getCycle();
  }

  public void worker() {
    cycle.run();
  }

  public static void main(String[] args) {



  }
}

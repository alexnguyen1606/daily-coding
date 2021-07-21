package com.designpattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:46 PM ,January 06,2021
 */
public class RedDuck extends Duck  {
    
    public RedDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior) {
        super(flyBehavior,quackBehavior);
    }
    
    @Override
    public void display(){
        System.out.println("this is red duck");
    }
    public static void main(String[] args) {
        FlyBehavior flyBehavior = new FlyWithWings();
        QuackBehavior quackBehavior = new Quack();
        Duck redDuck = new RedDuck(flyBehavior,quackBehavior);
        redDuck.performFly();
        redDuck.display();
    }
}

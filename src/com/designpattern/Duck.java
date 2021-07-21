package com.designpattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:46 PM ,January 06,2021
 */
public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    public Duck(FlyBehavior flyBehavior,QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    
    public void display(){
        System.out.println("this is a duck");
    }
    final void performFly(){
        flyBehavior.fly();
    }
    final void performQuack(){
        quackBehavior.quack();
    }
    
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }
    
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    
    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

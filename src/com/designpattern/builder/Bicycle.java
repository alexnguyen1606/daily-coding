package com.designpattern.builder;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:15 PM ,July 20,2021
 */
public class Bicycle {
    private String name;
    private Integer gear;
    private Integer speed;
    
    private  Bicycle(Builder builder){
        this.name = builder.name;
        this.gear = builder.gear;
        this.speed = builder.speed;
    }
    
    public Builder builder(){
        return new Builder();
    }
    
    public static class Builder{
        private String name;
        private Integer gear;
        private Integer speed;
        
        public Bicycle build(){
            return new Bicycle(this);
        }
        
        public Builder name(String name){
            this.name = name;
            return this;
        }
    
        public Builder gear(int gear){
            this.gear = gear;
            return this;
        }
    
        public Builder speed(int speed){
            this.speed = speed;
            return this;
        }
        
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getGear() {
        return gear;
    }
    
    public Integer getSpeed() {
        return speed;
    }
}


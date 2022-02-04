package com.designpattern.decoratorspattern.starbuckdecorator;

import com.designpattern.decoratorspattern.starbuckdecorator.beverage.Beverage;
import com.designpattern.decoratorspattern.starbuckdecorator.beverage.Espresso;
import com.designpattern.decoratorspattern.starbuckdecorator.condiment.Mocha;
import com.designpattern.decoratorspattern.starbuckdecorator.condiment.Soy;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:06 PM ,January 12,2021
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }
}

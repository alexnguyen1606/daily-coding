package designpattern.decoratorspattern.starbuckdecorator;

import designpattern.decoratorspattern.starbuckdecorator.beverage.Beverage;
import designpattern.decoratorspattern.starbuckdecorator.beverage.Espresso;
import designpattern.decoratorspattern.starbuckdecorator.condiment.Mocha;
import designpattern.decoratorspattern.starbuckdecorator.condiment.Soy;

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

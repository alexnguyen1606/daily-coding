package com.designpattern.factorypattern.abstracts.pizzaingredient;

import com.designpattern.factorypattern.abstracts.pizzaingredient.stores.ChicagoPizzaStore;
import com.designpattern.factorypattern.abstracts.pizzaingredient.stores.PizzaStore;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:48 PM ,January 17,2021
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        String order = "cheese";
        chicagoStore.orderPizza(order);
        
    }
}

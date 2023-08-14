package com.designpattern.factorypattern.method.pizzafactory.stores;

import com.designpattern.factorypattern.method.pizzafactory.pizza.ChicagoPizzaStyle;
import com.designpattern.factorypattern.method.pizzafactory.pizza.Pizza;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:06 PM ,January 15,2021
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheesee")) {
            return new ChicagoPizzaStyle();
        }
        return null;
    }
    
}

package designpattern.factorypattern.method.pizzafactory.stores;

import designpattern.factorypattern.method.pizzafactory.pizza.Pizza;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:02 PM ,January 15,2021
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);
    
    public void orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

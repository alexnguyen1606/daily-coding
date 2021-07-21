package designpattern.factorypattern.abstracts.pizzaingredient.stores;

import designpattern.factorypattern.abstracts.pizzaingredient.pizzas.Pizza;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:30 PM ,January 17,2021
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);
    public void orderPizza(String item){
        Pizza pizza= createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza.toString());
    }
}

package com.designpattern.factorypattern.abstracts.pizzaingredient.stores;

import com.designpattern.factorypattern.abstracts.pizzaingredient.factory.NYPizzaIngredientFactory;
import com.designpattern.factorypattern.abstracts.pizzaingredient.pizzas.CheesePizza;
import com.designpattern.factorypattern.abstracts.pizzaingredient.pizzas.PepperoniPizza;
import com.designpattern.factorypattern.abstracts.pizzaingredient.pizzas.Pizza;
import com.designpattern.factorypattern.abstracts.pizzaingredient.factory.PizzaIngradientFactory;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:31 PM ,January 17,2021
 */
public class NYPizzaStore extends PizzaStore {
   
    
    @Override
    public  Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngradientFactory pizzaIngradientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngradientFactory);
            pizza.setName("New York Style CheesePizza");
        }else if (item.equals("peperoni")){
            pizza = new PepperoniPizza(pizzaIngradientFactory);
            pizza.setName("NY Style PizzPeper");
        }
        return pizza;
    }
}

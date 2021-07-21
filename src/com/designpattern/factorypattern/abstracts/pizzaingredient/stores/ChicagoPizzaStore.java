package designpattern.factorypattern.abstracts.pizzaingredient.stores;

import designpattern.factorypattern.abstracts.pizzaingredient.factory.ChicagoIngredientFactory;
import designpattern.factorypattern.abstracts.pizzaingredient.factory.PizzaIngradientFactory;
import designpattern.factorypattern.abstracts.pizzaingredient.pizzas.CheesePizza;
import designpattern.factorypattern.abstracts.pizzaingredient.pizzas.Pizza;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:43 PM ,January 17,2021
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngradientFactory pizzaIngradientFactory = new ChicagoIngredientFactory();
        if (item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngradientFactory);
            pizza.setName("Chicago Style CheesePizza");
        }else if (item.equals("pepperoni")){
            pizza = new CheesePizza(pizzaIngradientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}

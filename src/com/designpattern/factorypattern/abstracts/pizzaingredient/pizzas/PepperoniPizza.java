package designpattern.factorypattern.abstracts.pizzaingredient.pizzas;

import designpattern.factorypattern.abstracts.pizzaingredient.factory.PizzaIngradientFactory;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:39 PM ,January 17,2021
 */
public class PepperoniPizza extends Pizza {
    PizzaIngradientFactory pizzaIngradientFactory;
    
    public PepperoniPizza(PizzaIngradientFactory pizzaIngradientFactory) {
        this.pizzaIngradientFactory = pizzaIngradientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Prepare "+name);
        dough = pizzaIngradientFactory.createDough();
        sauce = pizzaIngradientFactory.createSauce();
        veggies = pizzaIngradientFactory.createVeggies();
        clams = pizzaIngradientFactory.createClams();
        cheese = pizzaIngradientFactory.createCheese();
    }
}

package designpattern.factorypattern.abstracts.pizzaingredient.pizzas;

import designpattern.factorypattern.abstracts.pizzaingredient.factory.PizzaIngradientFactory;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:25 PM ,January 17,2021
 */
public class CheesePizza extends Pizza {
    PizzaIngradientFactory pizzaIngradientFactory;
    
    public CheesePizza(PizzaIngradientFactory pizzaIngradientFactory) {
        this.pizzaIngradientFactory = pizzaIngradientFactory;
    }
    
    @Override
    public void prepare() {
        System.out.println("Prepare :" + name);
        dough = pizzaIngradientFactory.createDough();
        veggies = pizzaIngradientFactory.createVeggies();
        clams = pizzaIngradientFactory.createClams();
        sauce = pizzaIngradientFactory.createSauce();
        cheese = pizzaIngradientFactory.createCheese();
        pepperoni = pizzaIngradientFactory.createPepperoni();
    }
}

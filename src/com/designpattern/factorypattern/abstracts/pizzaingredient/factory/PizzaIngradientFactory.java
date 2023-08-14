package com.designpattern.factorypattern.abstracts.pizzaingredient.factory;

import com.designpattern.factorypattern.abstracts.pizzaingredient.Sauce;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.Pepperoni;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.SlicedPepperoni;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Veggies;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.Cheese;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.Clams;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.Dough;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * January 17,2021
 */
public interface PizzaIngradientFactory {
    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
    Veggies[] createVeggies();
    Clams createClams();
    
    default Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}

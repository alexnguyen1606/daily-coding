package designpattern.factorypattern.abstracts.pizzaingredient.factory;

import designpattern.factorypattern.abstracts.pizzaingredient.Sauce;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.Pepperoni;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.SlicedPepperoni;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Veggies;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.Cheese;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.Clams;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.Dough;

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

package designpattern.factorypattern.abstracts.pizzaingredient.factory;

import designpattern.factorypattern.abstracts.pizzaingredient.Sauce;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.Pepperoni;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.SlicedPepperoni;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.Cheese;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.MozzarellaCheese;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.Clams;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.FrozenClams;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.Dough;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.ThinCrustDough;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.sauce.MarinaraSauce;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Mushroom;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Onion;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.RedPepper;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Veggies;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:46 PM ,January 17,2021
 */
public class ChicagoIngredientFactory implements PizzaIngradientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new RedPepper(), new Mushroom()};
    }
    
    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
    
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}

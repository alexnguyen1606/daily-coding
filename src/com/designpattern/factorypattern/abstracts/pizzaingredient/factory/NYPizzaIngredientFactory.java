package designpattern.factorypattern.abstracts.pizzaingredient.factory;

import designpattern.factorypattern.abstracts.pizzaingredient.*;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.Clams;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.FreshClams;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.Dough;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.ThinCrustDough;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.Cheese;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.ReggianoCheese;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.sauce.MarinaraSauce;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.*;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:01 PM ,January 17,2021
 */
public class NYPizzaIngredientFactory implements PizzaIngradientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new Garlic(), new RedPepper(), new Mushroom()};
        
    }
    
    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}

package com.designpattern.factorypattern.abstracts.pizzaingredient.factory;

import com.designpattern.factorypattern.abstracts.pizzaingredient.*;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.Clams;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.FreshClams;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.Dough;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.ThinCrustDough;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.Cheese;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.ReggianoCheese;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.sauce.MarinaraSauce;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.*;

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

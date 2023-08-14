package com.designpattern.factorypattern.abstracts.pizzaingredient.factory;

import com.designpattern.factorypattern.abstracts.pizzaingredient.Sauce;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.Pepperoni;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.SlicedPepperoni;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.Cheese;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.MozzarellaCheese;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.Clams;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.FrozenClams;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.Dough;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.ThinCrustDough;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.sauce.MarinaraSauce;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Mushroom;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Onion;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.RedPepper;
import com.designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Veggies;

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

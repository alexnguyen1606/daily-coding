package designpattern.factorypattern.abstracts.pizzaingredient.pizzas;

import designpattern.factorypattern.abstracts.pizzaingredient.Sauce;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.Pepperoni;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies.Veggies;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.cheese.Cheese;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.clams.Clams;
import designpattern.factorypattern.abstracts.pizzaingredient.ingredients.dough.Dough;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:08 PM ,January 17,2021
 */
public abstract class Pizza {
   volatile String name;
    Dough dough;
    Clams clams;
    Veggies veggies[];
    Cheese cheese;
    Sauce sauce;
    Pepperoni pepperoni;
    public abstract void prepare();
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void cut() {
        System.out.println("Cutting the pizzas into diagonal slices");
    }
    
    public void box() {
        System.out.println("Place pizzas in official PizzaStore box");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Pizza{" +
                       "name='" + name + '\'' +
                       ", dough=" + dough +
                       ", clams=" + clams +
                       ", veggies=" + Arrays.toString(veggies) +
                       ", cheese=" + cheese +
                       ", sauce=" + sauce +
                       '}';
    }
}

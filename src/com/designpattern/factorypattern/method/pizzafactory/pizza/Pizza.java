package designpattern.factorypattern.method.pizzafactory.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:02 PM ,January 15,2021
 */
public abstract class Pizza {
    protected List<String> toppings = new ArrayList<>();
    protected String name;
    protected String sauce;
    protected String dough;
    
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Add topping: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
        
    }
    
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void cut() {
        System.out.println("Cutting the pizzas into diagonal slices");
    }
    
    public void box() {
        System.out.println("Place pizzas in official PizzaStore box");
    }
}

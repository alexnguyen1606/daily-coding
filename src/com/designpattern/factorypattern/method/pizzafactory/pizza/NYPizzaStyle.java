package designpattern.factorypattern.method.pizzafactory.pizza;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:17 PM ,January 15,2021
 */
public class NYPizzaStyle extends Pizza {
    public NYPizzaStyle() {
        name = "NY Style Sauce and Chessee Pizza";
        dough = "Thin crust dough";
        sauce ="Marinara Sauce";
        toppings.add("Grated Chessee");
    }
    
}

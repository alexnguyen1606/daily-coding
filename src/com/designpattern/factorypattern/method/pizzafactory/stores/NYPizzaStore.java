package designpattern.factorypattern.method.pizzafactory.stores;

import designpattern.factorypattern.method.pizzafactory.pizza.NYPizzaStyle;
import designpattern.factorypattern.method.pizzafactory.pizza.Pizza;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:06 PM ,January 15,2021
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheesee")){
          return new NYPizzaStyle();
        }
        return null;
    }
    
}

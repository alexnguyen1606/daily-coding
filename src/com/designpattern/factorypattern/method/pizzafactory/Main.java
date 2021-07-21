package designpattern.factorypattern.method.pizzafactory;

import designpattern.factorypattern.method.pizzafactory.stores.ChicagoPizzaStore;
import designpattern.factorypattern.method.pizzafactory.stores.NYPizzaStore;
import designpattern.factorypattern.method.pizzafactory.stores.PizzaStore;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:21 PM ,January 15,2021
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStoreChi = new ChicagoPizzaStore();
        pizzaStoreChi.orderPizza("cheesee");
        PizzaStore pizzaStoreNy = new NYPizzaStore();
        pizzaStoreNy.orderPizza("cheesee");
    }
}

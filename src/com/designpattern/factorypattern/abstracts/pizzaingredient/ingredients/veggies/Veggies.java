package designpattern.factorypattern.abstracts.pizzaingredient.ingredients.veggies;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:59 PM ,January 17,2021
 */
public  abstract class Veggies {
    private String name;
    
    public Veggies(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

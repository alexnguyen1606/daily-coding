package designpattern.iterator;

import java.util.Iterator;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:57 AM ,January 23,2021
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private Double prices;
    
    public MenuItem(String name, String description, Double prices) {
        this.name = name;
        this.description = description;
        this.prices = prices;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getPrices() {
        return prices;
    }
    
    public void setPrices(Double prices) {
        this.prices = prices;
    }
    
    public void print(){
        this.toString();
    }
    
    @Override
    public Iterator<MenuComponent> createItorator() {
        return null;
    }
    
    @Override
    public String toString() {
        return "MenuItem{" +
                       "name='" + name + '\'' +
                       ", description='" + description + '\'' +
                       ", prices=" + prices +
                       '}';
    }
}

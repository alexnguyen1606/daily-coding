package designpattern.decoratorspattern.starbuckdecorator.beverage;

public abstract class Beverage {
    private String description = "Unknown Beverage";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
    
    public void setDescription(String description){
        this.description = description;
    }
}

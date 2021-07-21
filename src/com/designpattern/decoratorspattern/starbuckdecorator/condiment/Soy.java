package designpattern.decoratorspattern.starbuckdecorator.condiment;

import designpattern.decoratorspattern.starbuckdecorator.beverage.Beverage;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:59 PM ,January 12,2021
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;
    
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
    
    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
}

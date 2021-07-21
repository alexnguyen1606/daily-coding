package designpattern.decoratorspattern.starbuckdecorator.condiment;

import designpattern.decoratorspattern.starbuckdecorator.beverage.Beverage;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:03 PM ,January 12,2021
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;
    
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
    
    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
    
}

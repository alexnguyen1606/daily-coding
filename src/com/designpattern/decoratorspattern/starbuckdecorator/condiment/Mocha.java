package designpattern.decoratorspattern.starbuckdecorator.condiment;

import designpattern.decoratorspattern.starbuckdecorator.beverage.Beverage;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:56 PM ,January 12,2021
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
    
    public double cost(){
        return beverage.cost()+.20;
    }
    
}

package designpattern.decoratorspattern.starbuckdecorator.beverage;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:55 PM ,January 12,2021
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("House Blend");
    }
    
    @Override
    public double cost() {
        return 0.89;
    }
}

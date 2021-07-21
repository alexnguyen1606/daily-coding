package designpattern.decoratorspattern.starbuckdecorator.beverage;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:54 PM ,January 12,2021
 */
public class Espresso extends Beverage {
    public Espresso(){
        setDescription("Espresso");
    }
    @Override
    public double cost() {
        return 1.99;
    }
}

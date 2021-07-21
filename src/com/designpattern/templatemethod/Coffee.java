package designpattern.templatemethod;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:11 PM ,January 21,2021
 */
public class Coffee extends BeverageCaffein {
    @Override
    public void brew() {
        System.out.println("Brew Tea in Hot water 95C");
    }
    
    
    
    @Override
    public void pourInCup() {
        System.out.println("Pour Coffee in cup");
    }
    
    @Override
    public void addCondiments() {
        System.out.println("Add Milk");
    }
}

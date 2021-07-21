package designpattern.templatemethod;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:13 PM ,January 21,2021
 */
public class Tea extends BeverageCaffein {
   
    @Override
    public void brew() {
        System.out.println("Brew Tea");
    }
    
    @Override
    public void pourInCup() {
        System.out.println("Pour Tea in Cup");
    }
    
    @Override
    public void addCondiments() {
        System.out.println("Add Lemon");
    }
    
    @Override
    boolean customerWantCondiment() {
        return false;
    }
}

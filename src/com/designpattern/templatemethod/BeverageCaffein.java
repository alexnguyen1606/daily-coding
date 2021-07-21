package designpattern.templatemethod;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:09 PM ,January 21,2021
 */
public abstract class BeverageCaffein {
    
    private boolean wantCondiment;
    public abstract void brew();
    public  void boilSomeWater(){
        System.out.println("Boil water");
    }
    public abstract void pourInCup();
    public abstract void addCondiments();
    final public void prepareRecipe(){
        boilSomeWater();
        brew();
        pourInCup();
        if (customerWantCondiment()){
            addCondiments();
        }
    }
    
    // Hook
    // can override by subclass
    // That way control flow template method in abstract
    boolean customerWantCondiment(){
        return wantCondiment;
    }
    
    public void setWantCondiment(boolean wantCondiment) {
        this.wantCondiment = wantCondiment;
    }
}

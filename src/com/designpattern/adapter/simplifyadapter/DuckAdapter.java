package designpattern.adapter.simplifyadapter;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:14 PM ,January 20,2021
 */
public class DuckAdapter implements Duck {
    private Turkey turkey;
    
    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    
    @Override
    public void fly() {
        turkey.fly();
    }
    
    @Override
    public void quack() {
        turkey.buble();
    }
}

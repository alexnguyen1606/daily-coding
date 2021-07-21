package designpattern.observerpattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:10 PM ,January 11,2021
 */
public class ConcreteSubject implements Subject {
    private Integer state;
    @Override
    public void registerObserver() {
    
    }
    
    @Override
    public void removerObserver() {
    
    }
    
    @Override
    public void notifyObservers() {
    
    }
    
    @Override
    public void update() {
    
    }
    
    public Integer getState() {
        return state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }
}

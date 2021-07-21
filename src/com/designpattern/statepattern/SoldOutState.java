package designpattern.statepattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:28 PM ,March 03,2021
 */
public class SoldOutState implements State {
    private transient GumBallMachine gumBallMachine;
    private static final long serialVersionUID = 2L;
    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    
    @Override
    public void insertQuarter() {
    
    }
    
    @Override
    public void ejectQuarter() {
    
    }
    
    @Override
    public void turnCrank() {
    
    }
    
    @Override
    public void dispense() {
    
    }
}

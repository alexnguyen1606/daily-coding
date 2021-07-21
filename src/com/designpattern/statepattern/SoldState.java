package designpattern.statepattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:21 PM ,March 03,2021
 */
public class SoldState implements State {
    private transient GumBallMachine gumBallMachine;
    private static final long serialVersionUID = 2L;
    public SoldState(GumBallMachine gumBallMachine) {
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

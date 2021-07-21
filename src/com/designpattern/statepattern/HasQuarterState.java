package designpattern.statepattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:20 PM ,March 03,2021
 */
public class HasQuarterState implements State {
    private transient GumBallMachine gumBallMachine;
    private static final long serialVersionUID = 2L;
    
    public HasQuarterState(GumBallMachine gumBallMachine) {
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
        gumBallMachine.setState(gumBallMachine.getSoldState());
    }
    
    @Override
    public void dispense() {
    
    }
}

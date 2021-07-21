package designpattern.statepattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:17 PM ,February 19,2021
 */
public class NoQuarterState implements State {
    private transient GumBallMachine gumBallMachine;
    private static final long serialVersionUID = 2L;
    
    public NoQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("Tou inserted a quarter");
       
    }
    
    @Override
    public void ejectQuarter() {
        System.out.println("You are inserted a quarter !");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Yoy turned, but there's no a quarter");
    }
    
    @Override
    public void dispense() {
    
    }
}

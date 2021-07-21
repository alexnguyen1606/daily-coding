package designpattern.statepattern;

import designpattern.proxypattern.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:40 PM ,February 19,2021
 */
public class GumBallMachine extends UnicastRemoteObject implements GumballMachineRemote {
    int count;
    State soldState;
    State noQuarterState;
    State hasQuarterState;
    State soldOutState;
    State stateCurrent;
    private String location;
    private static final long serialVersionUID = 2L;
    
    public GumBallMachine(int count,String location) throws RemoteException {
        super();
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        this.location = location;
        
        if (count > 0) {
            stateCurrent = noQuarterState;
        } else {
            stateCurrent = soldOutState;
        }
    }
    
    public void setState(State state) {
        this.stateCurrent = state;
    }
    
    public void insertedQuarter() {
        stateCurrent.insertQuarter();
    }
    
    
    public void ejectQuarter() {
        stateCurrent.ejectQuarter();
    }
    
    public void turnCrank() {
        stateCurrent.turnCrank();
    }
    
    public void dispense() {
        stateCurrent.dispense();
    }
    
    
    public void releaseBall(){
        if (count!=0){
            count--;
        }
    }
    
    public int getCount() {
        return count;
    }
    
    public State getSoldState() {
        return soldState;
    }
    
    public State getNoQuarterState() {
        return noQuarterState;
    }
    
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    
    public State getSoldOutState() {
        return soldOutState;
    }
    
    public State getStateCurrent() {
        return stateCurrent;
    }
    
    public String getLocation() {
        return location;
    }
    
    @Override
    public State getState() {
        return stateCurrent;
    }
}

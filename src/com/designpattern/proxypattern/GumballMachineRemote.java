package designpattern.proxypattern;

import designpattern.statepattern.State;

import java.rmi.Remote;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:56 AM ,March 04,2021
 */
public interface GumballMachineRemote extends Remote {
    
    int getCount();
    String getLocation();
    State getState();
}

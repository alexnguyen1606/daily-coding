package designpattern.proxypattern;

import java.rmi.RemoteException;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:06 PM ,March 04,2021
 */
public class GumballMonitor {
    private GumballMachineRemote gumballMachineRemote;
    
    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }
    
    public void report(){
        System.out.println("Count:"+gumballMachineRemote.getCount());
        System.out.println("Location:"+gumballMachineRemote.getLocation());
        System.out.println("State:"+gumballMachineRemote.getState());
    
    
    }
}

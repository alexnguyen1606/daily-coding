package designpattern.proxypattern;

import designpattern.statepattern.GumBallMachine;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:02 PM ,March 04,2021
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {
        GumballMachineRemote gumballMachineRemote = null;
        int count;
        
        if (args.length<2){
            System.out.println("Gumball");
            System.exit(1);
        }
        
        count = Integer.parseInt(args[1]);
        gumballMachineRemote = new GumBallMachine(count,args[0]);
        try {
            LocateRegistry.createRegistry(6000);
            Naming.bind("//"+args[0]+"/gumball-machine",gumballMachineRemote);
            System.out.println("Server started");
        } catch (AlreadyBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    
    }
}

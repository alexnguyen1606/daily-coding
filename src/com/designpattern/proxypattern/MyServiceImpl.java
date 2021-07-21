package designpattern.proxypattern;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:48 AM ,March 04,2021
 */
public class MyServiceImpl extends UnicastRemoteObject implements MyService {
    
    private static final long serialVersionUID = 1L;
    
    protected MyServiceImpl() throws RemoteException {
    }
    
    @Override
    public String sayHi() throws RemoteException {
        return "Server say hey";
    }
    public static void main(String[] args) {
        try {
            MyService myService = new MyServiceImpl();
            LocateRegistry.createRegistry(6789);
            Naming.bind("rmi://localhost:6789/Hello",myService);
            System.out.println("Server started ...");
        } catch (RemoteException | AlreadyBoundException | MalformedURLException e) {
            e.printStackTrace();
        }finally {
        
        }
    }
}

package designpattern.proxypattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * March 04,2021
 */
// Service for Client
public interface MyService extends Remote {
    
    String sayHi() throws RemoteException;
}

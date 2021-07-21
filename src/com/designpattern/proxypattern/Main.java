package designpattern.proxypattern;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:56 AM ,March 04,2021
 */
public class Main {
    public static void main(String[] args) {
        try {
            MyService myService = new MyServiceImpl();
            Naming.bind("RemoteHello",myService);
        } catch (RemoteException | AlreadyBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

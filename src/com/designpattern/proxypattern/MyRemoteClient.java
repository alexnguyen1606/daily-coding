package designpattern.proxypattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:01 AM ,March 04,2021
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    public void go(){
        try {
            MyService myService = (MyService) Naming.lookup("rmi://172.0.0.1:6789/Hello");
            String s = myService.sayHi();
            System.out.println(s);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}

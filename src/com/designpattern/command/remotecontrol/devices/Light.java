package designpattern.command.remotecontrol.devices;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * January 19,2021
 */
public class Light {
    public void on() {
        System.out.println("Light turn on");
    }
    
    public void off() {
        System.out.println("Light turn off");
    }
}

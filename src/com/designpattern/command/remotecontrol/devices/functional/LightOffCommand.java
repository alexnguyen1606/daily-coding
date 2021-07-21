package designpattern.command.remotecontrol.devices.functional;

import designpattern.command.remotecontrol.Command;
import designpattern.command.remotecontrol.devices.Light;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:34 AM ,January 19,2021
 */
public class LightOffCommand implements Command {
    private Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.off();
    }
    
    @Override
    public void undo() {
        light.off();
    }
}

package com.designpattern.command.remotecontrol.devices.functional;

import com.designpattern.command.remotecontrol.Command;
import com.designpattern.command.remotecontrol.devices.Light;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:33 AM ,January 19,2021
 */
public class LightOnCommand implements Command {
    private final Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
    }
    
    @Override
    public void undo() {
        light.off();
    }
}

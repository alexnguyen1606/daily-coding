package com.designpattern.command.remotecontrol;

import com.designpattern.command.remotecontrol.devices.Light;
import com.designpattern.command.remotecontrol.devices.functional.LightOffCommand;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:37 AM ,January 19,2021
 */
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Command turnOff = new LightOffCommand(light);
        simpleRemoteControl.setCommand(turnOff);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.undoButtonPressed();
        simpleRemoteControl.buttonWasPressed();
    }
    
}

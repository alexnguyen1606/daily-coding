package designpattern.command.remotecontrol;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:26 AM ,January 19,2021
 */
public class RemoteMultiDevices {
    private Command[] commandTurnOn;
    private Command[] commandTurnOff;
    private Command undoCommand;
    private int length;
    public RemoteMultiDevices(int length) {
        Command doNothing = new DoNothingCommand();
        this.length = length;
        commandTurnOn = new Command[length];
        commandTurnOff= new Command[length];
        for (int i = 0;i<length;i++){
            commandTurnOn[i] = doNothing;
            commandTurnOff[i] = doNothing;
        }
    }
    public void setCommand(int index,Command commandOn,Command commandOff){
        checkIndexAvailable(index);
        commandTurnOn[index] = commandOn;
        commandTurnOff[index] = commandOff;
    }
    public void onBottom(int index){
        checkIndexAvailable(index);
        commandTurnOn[index].execute();
        undoCommand = commandTurnOn[index];
    }
    
    public void offBottom(int index){
        checkIndexAvailable(index);
        commandTurnOff[index].execute();
        undoCommand = commandTurnOff[index];
    }
    
    private void checkIndexAvailable(int index){
        if (index>=length){
            throw new RuntimeException("Out of devices:"+index);
        }
    }
}

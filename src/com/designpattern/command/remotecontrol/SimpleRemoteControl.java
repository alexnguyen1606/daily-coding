package designpattern.command.remotecontrol;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:36 AM ,January 19,2021
 */
public class SimpleRemoteControl {
    private Command command;
    private Command undoCommand;
    public SimpleRemoteControl() {
    
    }
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void buttonWasPressed(){
        command.execute();
        undoCommand = command;
    }
    
    public void undoButtonPressed(){
        undoCommand.undo();
    }
}

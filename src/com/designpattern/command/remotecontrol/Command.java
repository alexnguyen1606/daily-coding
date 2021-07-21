package designpattern.command.remotecontrol;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * January 19,2021
 */
public interface Command {
    void execute();
    
    default void undo() {
    
    }
}

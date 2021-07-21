package designpattern.statepattern;

import java.io.Serializable;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:15 PM ,February 19,2021
 */
public interface State extends Serializable {
     void insertQuarter();
     void ejectQuarter();
     void turnCrank();
     void dispense();
}

package designpattern.iterator;

import java.util.Iterator;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * January 26,2021
 */
public interface Menu extends Iterator<MenuItem> {
     Iterator<MenuItem> createItorator();
}

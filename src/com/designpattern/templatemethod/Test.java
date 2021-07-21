package designpattern.templatemethod;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:55 AM ,January 23,2021
 */
public class Test implements Iterator<Integer> {
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public Integer next() {
        return null;
    }
    
    @Override
    public void remove() {
    
    }
    
    @Override
    public void forEachRemaining(Consumer<? super Integer> action) {
    
    }
}

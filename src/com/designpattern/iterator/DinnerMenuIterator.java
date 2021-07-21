package designpattern.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:57 AM ,January 23,2021
 */
public class DinnerMenuIterator implements Menu {
    private MenuItem[] items;
    private int currentIndex;
    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
        currentIndex = 0;
    }
    
    @Override
    public boolean hasNext() {
        if (currentIndex >= items.length){
            return false;
        }
        return true;
    }
    
    @Override
    public MenuItem next() {
        return items[currentIndex++];
    }
    
    @Override
    public Iterator<MenuItem> createItorator() {
        return this;
    }
}

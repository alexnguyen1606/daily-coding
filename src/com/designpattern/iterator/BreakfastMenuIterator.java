package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:03 AM ,January 23,2021
 */
public class BreakfastMenuIterator implements Menu {
    private List<MenuItem> items;
    private int itemIndex;
    public BreakfastMenuIterator(List<MenuItem> items) {
        this.items = items;
    }
    
    @Override
    public boolean hasNext() {
        return items.size()>0;
    }
    
    @Override
    public MenuItem next() {
        return items.remove(itemIndex);
    }
    
    @Override
    public Iterator<MenuItem> createItorator() {
        return this;
    }
}

package designpattern.iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:41 AM ,February 17,2021
 */
public class CafeMenuIterator implements Menu {
    private HashMap<String,MenuItem> menuItems = new HashMap<>();
    @Override
    public Iterator<MenuItem> createItorator() {
        return menuItems.values().iterator();
    }
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public MenuItem next() {
        return null;
    }
}

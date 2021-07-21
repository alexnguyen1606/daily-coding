package designpattern.iterator;

import java.util.Iterator;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:31 AM ,February 19,2021
 */
public abstract class MenuComponent {
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    
    public Double getPrices(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
    
    public abstract Iterator<MenuComponent> createItorator();
    
}

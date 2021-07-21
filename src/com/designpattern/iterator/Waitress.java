package designpattern.iterator;

import java.util.Iterator;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:51 PM ,January 26,2021
 */
public class Waitress {
    private Menu menu;
    
    public Waitress(Menu menu) {
        this.menu = menu;
    }
    
    public void printMenu() {
        while (menu.hasNext()) {
            System.out.println(menu.next().toString());
        }
    }
    
    public void printMenu(Iterator<MenuItem> items){
        while (items.hasNext()){
            System.out.println(items.next().toString());
        }
    }
}

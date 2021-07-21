package designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:08 AM ,January 23,2021
 */
public class Main {
    public static void main(String[] args) {
      
        MenuItem menuItem1 = new MenuItem("Egg","CHứng chiên",11.01);
        MenuItem menuItem2 = new MenuItem("Egg2","CHứng chiên",11.01);
        MenuItem menuItem3 = new MenuItem("Egg3","CHứng chiên",11.01);
        MenuItem[] menuItems = new MenuItem[]{menuItem1,menuItem2,menuItem3};
        List<MenuItem> listItems = new ArrayList<>();
        listItems.add(menuItem1);
        listItems.add(menuItem2);
        listItems.add(menuItem3);
        Menu itemIterator = new DinnerMenuIterator(menuItems);
        Menu itemIteratorList = new BreakfastMenuIterator(listItems);
        Waitress waitress = new Waitress(itemIterator);
//        waitress.printMenu();/
        waitress.printMenu(itemIteratorList.createItorator());
       
        
    }
}

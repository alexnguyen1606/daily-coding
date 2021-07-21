package designpattern.templatemethod;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:14 PM ,January 21,2021
 */
public class Main {
    
    public static void main(String[] args) {
        BeverageCaffein beverageCaffein = new Tea();
        beverageCaffein.setWantCondiment(true);
        beverageCaffein.prepareRecipe();
        
    }
}

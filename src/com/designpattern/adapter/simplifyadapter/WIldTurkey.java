package designpattern.adapter.simplifyadapter;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:14 PM ,January 20,2021
 */
public class WIldTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("Fly 1 m");
    }
    
    @Override
    public void buble() {
        System.out.println("Buble bulble");
    }
}

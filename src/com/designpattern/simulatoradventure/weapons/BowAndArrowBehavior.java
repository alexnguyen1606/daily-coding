package designpattern.simulatoradventure.weapons;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:25 PM ,January 07,2021
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Use arrow and bow");
    }
}

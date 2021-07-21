package designpattern.simulatoradventure.weapons;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:26 PM ,January 07,2021
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Use Axe");
    }
}

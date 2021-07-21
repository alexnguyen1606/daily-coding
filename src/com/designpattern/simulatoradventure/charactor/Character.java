package designpattern.simulatoradventure.charactor;

import designpattern.simulatoradventure.weapons.WeaponBehavior;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:19 PM ,January 07,2021
 */
public abstract class Character {
    private WeaponBehavior weaponBehavior;
    
    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
    
    public void fight(){
        weaponBehavior.useWeapon();
    }
    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
    
}

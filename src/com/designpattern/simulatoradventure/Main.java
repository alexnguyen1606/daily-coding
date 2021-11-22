package com.com.designpattern.simulatoradventure;

import com.designpattern.simulatoradventure.charactor.Character;
import com.designpattern.simulatoradventure.charactor.King;
import com.designpattern.simulatoradventure.weapons.AxeBehavior;
import com.designpattern.simulatoradventure.weapons.SwordBehavior;
import com.designpattern.simulatoradventure.weapons.WeaponBehavior;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:31 PM ,January 07,2021
 */

public class Main {
    public static void main(String[] args) {
        WeaponBehavior axeBehavior  = new AxeBehavior();
        Character king = new King(axeBehavior);
        king.fight();
        WeaponBehavior sword = new SwordBehavior();
        king.setWeaponBehavior(sword);
        king.fight();
    }
}

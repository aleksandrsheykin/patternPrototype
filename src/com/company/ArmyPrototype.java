package com.company;

/**
 * Created by admin on 03.05.2017.
 */
public class ArmyPrototype implements ArmyPrototypeInt {

    public enum armyType {
        PODRAZDELENIE, VZVOD, ROTA, BATALION, POLK, DIVIZIA
    }

    @Override
    public ArmyPrototypeInt copy() {
        return new ArmyPrototype();
    }

    public void setType(armyType t) {

    }


}


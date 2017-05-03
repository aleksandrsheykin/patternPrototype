package com.company.armyStructure;

import com.company.armyStructure.parts.Ammunition;
import com.company.armyStructure.parts.Solders;

/**
 * Created by admin on 03.05.2017.
 */
public class Rota implements Solders, Ammunition {
    private Integer ammunition;
    private final Integer countVzvod = 5;
    private Vzvod vzvod;
    private Integer countAmmunition;

    public Rota() {
        this.vzvod = new Vzvod();
    }

    public Integer getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(Integer ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public Integer getSolderCount() {
        return vzvod.getSolderCount() * countVzvod;
    }

    @Override
    public Integer getAmmunitionCount() {
        return ammunition;
    }

    public void setCountAmmunition(Integer countAmmunition) {
        this.countAmmunition = countAmmunition;
    }


}

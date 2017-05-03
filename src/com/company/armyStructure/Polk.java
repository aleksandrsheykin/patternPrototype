package com.company.armyStructure;

import com.company.armyStructure.parts.Ammunition;
import com.company.armyStructure.parts.Solders;
import com.company.armyStructure.parts.Technics;

/**
 * Created by admin on 03.05.2017.
 */
public class Polk implements Ammunition, Solders, Technics {
    private Integer technics;
    private Batalion batalion;
    private final Integer countBatalion = 4;

    public Polk() {
        this.batalion = new Batalion();
    }

    public void setTechnics(Integer technics) {
        this.technics = technics;
    }

    @Override
    public Integer getSolderCount() {
        return batalion.getSolderCount()*countBatalion;
    }

    @Override
    public Integer getTechCount() {
        return batalion.getTechCount()*countBatalion;
    }

    @Override
    public Integer getAmmunitionCount() {
        return batalion.getAmmunitionCount()*countBatalion;
    }
}

package com.company.armyStructure;

import com.company.armyStructure.parts.Ammunition;
import com.company.armyStructure.parts.Solders;
import com.company.armyStructure.parts.Technics;

/**
 * Created by admin on 03.05.2017.
 */
public class Division implements Ammunition, Solders, Technics {
    private Polk polk;
    private final Integer countPolk = 8;

    @Override
    public Integer getSolderCount() {
        return null;
    }

    @Override
    public Integer getTechCount() {
        return null;
    }

    @Override
    public Integer getAmmunitionCount() {
        return null;
    }
}

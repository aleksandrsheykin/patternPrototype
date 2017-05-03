package com.company.armyStructure;

import com.company.armyStructure.parts.Ammunition;
import com.company.armyStructure.parts.Solders;
import com.company.armyStructure.parts.Technics;

/**
 * Created by admin on 03.05.2017.
 */
public class Batalion implements Solders, Ammunition, Technics {
    private final Integer countRota = 6;
    private Rota rota;
    private final Integer countTech=7;

    public Batalion() {
        this.rota = new Rota();
    }

    @Override
    public Integer getSolderCount() {
        return rota.getSolderCount()*countRota;
    }

    @Override
    public Integer getTechCount() {
        return countTech;
    }

    @Override
    public Integer getAmmunitionCount() {
        return getAmmunitionCount()*countRota;
    }
}

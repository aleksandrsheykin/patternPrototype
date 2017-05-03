package com.company.armyStructure;

import com.company.armyStructure.parts.Solders;

/**
 * Created by admin on 03.05.2017.
 */
public class Vzvod implements Solders {
    private final Integer countPodrazdelen = 4;
    private Podrazdelenie podrazdelenie;

    public Vzvod() {
        this.podrazdelenie = new Podrazdelenie();
    }

    @Override
    public Integer getSolderCount() {
        return podrazdelenie.getSolderCount() * countPodrazdelen;
    }
}

package com.company.armyStructure;

import com.company.armyStructure.parts.Solders;

/**
 * Created by admin on 03.05.2017.
 */
public class Podrazdelenie implements Solders {
    private Integer countSolder;

    public void setCountSolder(Integer countSolder) {
        this.countSolder = countSolder;
    }

    @Override
    public Integer getSolderCount() {
        return this.countSolder;
    }
}

package org.iesfm.collections;

import java.util.Comparator;

public class ZoneComparator implements Comparator<Zone> {

    @Override
    public int compare(Zone zone, Zone t1) {
        int compare = zone.getName().compareTo(t1.getName());
        return compare;
    }
}

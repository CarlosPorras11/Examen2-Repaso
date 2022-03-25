package org.iesfm.collections;

import org.iesfm.collections.exceptions.CageNotFoundException;
import org.iesfm.collections.exceptions.ZoneNotFoundException;

import java.util.List;
import java.util.Set;

public interface IZoo {

    List<Cage> getCageByZone(String name) throws ZoneNotFoundException;
    Set<String> getSpeciesByCageNumAndZone(String name, int cageNum) throws ZoneNotFoundException, CageNotFoundException;
    List<Cage> getCagesBySpecie(String specie) throws ZoneNotFoundException;

}

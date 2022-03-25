package org.iesfm.collections;

import org.iesfm.collections.exceptions.CageNotFoundException;
import org.iesfm.collections.exceptions.ZoneNotFoundException;

import java.util.*;

public class Zoo implements IZoo {
    private String name;
    private Map<String, Zone> zoneMap;

    public Zoo(String name, Map<String, Zone> zoneMap) {
        this.name = name;
        this.zoneMap = zoneMap;
    }

    @Override
    public List<Cage> getCageByZone(String name) throws ZoneNotFoundException {
        if (!zoneMap.containsKey(name)) {
            throw new ZoneNotFoundException();
        }
        return zoneMap.get(name).getCages();
    }

    @Override
    public Set<String> getSpeciesByCageNumAndZone(String name, int cageNum) throws ZoneNotFoundException, CageNotFoundException {
        List<Cage> cages = getCageByZone(name);
        for (Cage cage : cages) {
            if (cage.getCageNum() == cageNum) {
                return cage.getSpecies();
            }
        }
        throw new CageNotFoundException();
    }

    @Override
    public List<Cage> getCagesBySpecie(String specie) throws ZoneNotFoundException {
        List<Cage> cagesWithSpecies = new LinkedList<>();
        for (Zone zone: zoneMap.values()){
            for (Cage cage: getCageByZone(zone.getName())){
                if (cage.getSpecies().contains(specie)){
                    cagesWithSpecies.add(cage);
                }
            }
        }
        return cagesWithSpecies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Zone> getZoneMap() {
        return zoneMap;
    }

    public void setZoneMap(Map<String, Zone> zoneMap) {
        this.zoneMap = zoneMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(name, zoo.name) && Objects.equals(zoneMap, zoo.zoneMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, zoneMap);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", zoneMap=" + zoneMap +
                '}';
    }

}
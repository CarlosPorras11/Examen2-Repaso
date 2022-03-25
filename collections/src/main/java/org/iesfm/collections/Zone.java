package org.iesfm.collections;

import java.util.List;
import java.util.Objects;

public class Zone{
    private String name;
    private List<Cage> cages;

    public Zone(String name, List<Cage> cages) {
        this.name = name;
        this.cages = cages;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cage> getCages() {
        return cages;
    }

    public void setCages(List<Cage> cages) {
        this.cages = cages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zone zone = (Zone) o;
        return Objects.equals(name, zone.name) && Objects.equals(cages, zone.cages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cages);
    }

    @Override
    public String toString() {
        return "Zone{" +
                "name='" + name + '\'' +
                ", cages=" + cages +
                '}';
    }


}
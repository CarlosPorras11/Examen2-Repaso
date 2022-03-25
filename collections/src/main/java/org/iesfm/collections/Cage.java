package org.iesfm.collections;

import java.util.Objects;
import java.util.Set;

public class Cage {
    private int cageNum;
    private Set<String> species;

    public Cage(int cageNum, Set<String> species) {
        this.cageNum = cageNum;
        this.species = species;
    }

    public int getCageNum() {
        return cageNum;
    }

    public void setCageNum(int cageNum) {
        this.cageNum = cageNum;
    }

    public Set<String> getSpecies() {
        return species;
    }

    public void setSpecies(Set<String> species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cage cage = (Cage) o;
        return cageNum == cage.cageNum && Objects.equals(species, cage.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cageNum, species);
    }

    @Override
    public String toString() {
        return "Cage{" +
                "cageNum=" + cageNum +
                ", species=" + species +
                '}';
    }
}
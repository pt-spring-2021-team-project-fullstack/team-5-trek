package com.jackr.trek.jackrtrekproject;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "trekDifficultyLevel")
    private Collection<Trek> treks;

    @OneToMany(mappedBy = "continent")
    private Collection<Region> regions;

    @ManyToOne
    private TrekType trekType;

    public Long getId() {
        return id;
    }

//    public String getContinentName() {
//        return name;
//    }

    public String getName() {
        return name;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }

    public Collection<Region> getRegions(){
        return regions;
    }

    protected Continent() {}

    public Continent(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
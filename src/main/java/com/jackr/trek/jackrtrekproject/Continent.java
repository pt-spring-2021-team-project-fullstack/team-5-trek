package com.jackr.trek.jackrtrekproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "continent")
    private Collection<Region> regions;



    private Long regionIdentifier;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getRegionIdentifier() {
        return regionIdentifier;
    }

    public Collection<Region> getRegions(){
        return regions;
    }

    protected Continent() {}

    public Continent(String name, Long regionIdentifier) {
        this.name = name;
        this.regionIdentifier = regionIdentifier;
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
package com.jackr.trek.jackrtrekproject;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;

    private String regionName;

    @ManyToOne
    private Continent continent;


    private Long continentIdentifier;

    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return regionName;
    }

    public Long getContinentIdentifier() {
        return continentIdentifier;
    }

    protected Region() {}

    public Region(String regionName, Continent continent, Long continentIdentifier) {
        this.regionName = regionName;
        this.continent = continent;
        this.continentIdentifier = continentIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
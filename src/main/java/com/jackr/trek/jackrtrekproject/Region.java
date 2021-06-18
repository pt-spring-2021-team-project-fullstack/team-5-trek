package com.jackr.trek.jackrtrekproject;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;

    private String regionName;

    @OneToMany(mappedBy = "region")
    private Collection<Trek> treks;

    @ManyToOne
    private Continent continent;

    @ManyToMany(mappedBy = "regions")
    private Collection<TrekType> trekTypes;

    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return regionName;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }

//    public Continent getContinent() {
//        return continent;
//    }

    protected Region() {}

    public Region(String regionName) {
        this.regionName = regionName;
    }

//    public Region(String nameOfRegion, Continent continent) {
//        this.nameOfRegion = nameOfRegion;
//        this.continent = continent;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    public Continent getContinent() {
        return continent;
    }

    public Collection<TrekType> getTrekTypes() {
        return trekTypes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
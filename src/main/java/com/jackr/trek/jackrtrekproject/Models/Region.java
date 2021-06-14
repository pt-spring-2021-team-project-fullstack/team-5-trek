package com.jackr.trek.jackrtrekproject.Models;

import javax.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;

    private String nameOfRegion;

//    @ManyToOne
//    private Collection<Continent> continents;

    @ManyToOne
    private Continent continent;

    @OneToMany(mappedBy = "region")
    private Collection<Trek> treks;

    protected Region(){}

    public Region(String nameOfRegion, Continent continent) {
        this.nameOfRegion = nameOfRegion;
        this.continent = continent;
    }

    public Long getId() {
        return id;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

//    public Collection<Continent> getContinents(){
//        return continents;
//    }

    public Continent getContinent() {
        return continent;
    }

    public Collection<Trek> getTreks(){
        return treks;
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
package com.jackr.trek.jackrtrekproject.Models;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "continent")
    private Collection<Trek> treks;

    protected Continent(){}

    public Continent(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public Collection<Region> getRegions(){
        return regions;
    }

    public Collection<Trek> getTreks(){
        return treks;
    }

    public String getName(){
        return name;
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
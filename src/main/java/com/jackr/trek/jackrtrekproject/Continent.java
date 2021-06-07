package com.jackr.trek.jackrtrekproject;


import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;

    private String nameOfContinent;

    @OneToMany
    private Region region;

    @OneToMany
    private Collection<Trek> treks;

    protected Continent(){}

    public Continent(String nameOfContinent){
        this.nameOfContinent = nameOfContinent;
    }

    public Long getId(){
        return id;
    }

    public Region getRegion(){
        return region;
    }

    public Collection<Trek> getTreks(){
        return treks;
    }

    public String getNameOfContinent(){
        return nameOfContinent;
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
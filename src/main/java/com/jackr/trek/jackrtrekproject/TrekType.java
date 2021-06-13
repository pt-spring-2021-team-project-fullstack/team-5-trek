package com.jackr.trek.jackrtrekproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class TrekType {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "trekType")
    private Collection<Trek> allTreks;

    private Long getId() {
        return id;
    }

    private String getName() {
        return name;
    }

    private String getDescription() {
        return description;
    }

    private Collection<Trek> getAllTreks() {
        return allTreks;
    }

    protected TrekType() {};

    public TrekType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrekType that = (TrekType) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
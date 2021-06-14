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

    private String difficultyLevel;

    @OneToMany(mappedBy = "difficultyLevel")
    private Collection<Trek> treks;

    public TrekType() {}

    public TrekType(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Long getId() {
        return id;
    }

    public String getTrekDifficultyLevel() {
        return difficultyLevel;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrekType trekType = (TrekType) o;
        return Objects.equals(id, trekType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
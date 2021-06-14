package com.jackr.trek.jackrtrekproject.Models;

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

    private String trekType;
    private String trekTypePerContinent;
    private String trekTypePerContinentRegion;
    private String trekTypeDescription;
    private String trekTypeDifficultyLevel;
    private String trekTypePhysicalRequirements;
    private String trekTypeTips;
    private String trekTypeTerrain;

    @OneToMany(mappedBy = "trekType")
    private Collection<Trek> allTreks;

    private Long getId() {
        return id;
    }

    public String getTrekType() {
        return trekType;
    }

    public String getTrekTypePerContinent() {
        return trekTypePerContinent;
    }

    public String getTrekTypePerContinentRegion() {
        return trekTypePerContinentRegion;
    }

    public String getTrekTypeDescription() {
        return trekTypeDescription;
    }

    public String getTrekTypeDifficultyLevel() {
        return trekTypeDifficultyLevel;
    }

    public String getTrekTypePhysicalRequirements() {
        return trekTypePhysicalRequirements;
    }

    public String getTrekTypeTips() {
        return trekTypeTips;
    }

    public String getTrekTypeTerrain() {
        return trekTypeTerrain;
    }

    private Collection<Trek> getAllTreks() {
        return allTreks;
    }

    protected TrekType() {};

    public TrekType(String trekType, String trekTypePerContinent, String trekTypePerContinentRegion,
                    String trekTypeDescription, String trekTypeDifficultyLevel,
                    String trekTypePhysicalRequirements, String trekTypeTips, String trekTypeTerrain) {
        this.trekType = trekType;
        this.trekTypePerContinent = trekTypePerContinent;
        this.trekTypePerContinentRegion = trekTypePerContinentRegion;
        this.trekTypeDescription = trekTypeDescription;
        this.trekTypeDifficultyLevel = trekTypeDifficultyLevel;
        this.trekTypePhysicalRequirements = trekTypePhysicalRequirements;
        this.trekTypeTips = trekTypeTips;
        this.trekTypeTerrain = trekTypeTerrain;
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
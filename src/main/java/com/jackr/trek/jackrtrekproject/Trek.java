package com.jackr.trek.jackrtrekproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Trek {

    @Id
    @GeneratedValue
    private Long id;

    private String trekName;
    private String description;
    private boolean guidedOrNot;
    private String landmarks;
    private String campsiteInfo;
    private String transportation;
    private String nearbyActivities;
    private String cost;
    private String length;
    private String reviews;

    @ManyToOne
    private TrekType difficultyLevel;

    @ManyToOne
    private Continent continent;

    @ManyToOne
    private Region region;

    protected Trek() {}

    public Long getId() {
        return id;
    }

    public String getTrekName() {
        return trekName;
    }

    public String getDescription() {
        return description;
    }

    public boolean isGuidedOrNot() {
        return guidedOrNot;
    }

    public String getLandmarks() {
        return landmarks;
    }

    public String getCampsiteInfo() {
        return campsiteInfo;
    }

    public String getTransportation() {
        return transportation;
    }

    public String getNearbyActivities() {
        return nearbyActivities;
    }

    public String getCost() {
        return cost;
    }

    public String getLength() {
        return length;
    }

    public String getReviews() {
        return reviews;
    }

    public TrekType getDifficultyLevel() {
        return difficultyLevel;
    }

    public Continent getContinent() {
        return continent;
    }

    public Region getRegion() {
        return region;
    }

    public Trek(String trekName, TrekType difficultyLevel, Continent continent, Region region, String description,
                boolean guidedOrNot, String landmarks, String campsiteInfo, String transportation, String nearbyActivities,
                String cost, String length, String reviews) {
        this.trekName = trekName;
        this.difficultyLevel = difficultyLevel;
        this.continent = continent;
        this.region = region;
        this.description = description;
        this.guidedOrNot = guidedOrNot;
        this.landmarks = landmarks;
        this.campsiteInfo = campsiteInfo;
        this.transportation = transportation;
        this.nearbyActivities = nearbyActivities;
        this.cost = cost;
        this.length = length;
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trek trek = (Trek) o;
        return Objects.equals(id, trek.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
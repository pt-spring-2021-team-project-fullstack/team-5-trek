package com.jackr.trek.jackrtrekproject;

import javax.persistence.*;
import java.util.Collection;

import java.util.Objects;

@Entity
public class Trek {
    @Id
    @GeneratedValue
    private Long id;

    private String trekDescription;
    private boolean trekGuidedOrNot;
    private String trekLandmarks;
    private String trekCampsiteInfo;
    private String trekTransportation;
    private String nearbyActivities;
    private String trekCost;
    private String trekLength;
    private String trekReviews;

    @OneToOne
    private TrekType trekType;

    @ManyToOne
    private Collection<Region> regions;

    @ManyToOne
    private Collection<Continent> continents;

    public Long getId() {
        return id;
    }

    public String getTrekDescription() {
        return trekDescription;
    }

    public boolean getGuideInfo() {
        return trekGuidedOrNot;
    }

    public String getTrekLandmarks() {
        return trekLandmarks;
    }

    public String getTrekCampsiteInfo() {
        return trekCampsiteInfo;
    }

    public String getTrekTransportation() {
        return trekTransportation;
    }

    public String getNearbyActivities() {
        return nearbyActivities;
    }

    public String getTrekCost() {
        return trekCost;
    }

    public String getTrekLength() {
        return trekLength;
    }

    public String getTrekReviews() {
        return trekReviews;
    }

    public TrekType getTrekType() {
        return trekType;
    }

    public Trek(String trekDescription, boolean trekGuidedOrNot, String trekLandmarks, String trekCampsiteInfo,
                String trekTransportation, String nearbyActivities, String trekCost, String trekLength,
                String trekReviews, TrekType trekType) {
        this.trekDescription = trekDescription;
        this.trekGuidedOrNot = trekGuidedOrNot;
        this.trekLandmarks = trekLandmarks;
        this.trekCampsiteInfo = trekCampsiteInfo;
        this.trekTransportation = trekTransportation;
        this.nearbyActivities = nearbyActivities;
        this.trekCost = trekCost;
        this.trekLength = trekLength;
        this.trekReviews = trekReviews;
        this.trekType = trekType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trek that = (Trek) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

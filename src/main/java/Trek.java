import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Trek {
    @Id
    @GeneratedValue
    private Long id;

    private String trekType;
    private String trekDescription;
    private String trekDifficultyLevel;
    private boolean trekGuidedOrNot;
    private String trekPhysicalRequirements;
    private String trekTips;
    private String trekLandmarks;
    private String trekCampsiteInfo;
    private String trekTerrain;
    private String trekTransportation;
    private String nearbyActivities;
    private String trekCost;
    private String trekLength;
    private String trekReviews;

    public Long getId() {
        return id;
    }

    public String getTrekType() {
        return trekType;
    }

    public String getTrekDescription() {
        return trekDescription;
    }

    public String getTrekDifficultyLevel() {
        return trekDifficultyLevel;
    }

    public boolean getGuideInfo() {
        return trekGuidedOrNot;
    }

    public String getTrekPhysicalRequirements() {
        return trekPhysicalRequirements;
    }

    public String getTrekTips() {
        return trekTips;
    }

    public String getTrekLandmarks() {
        return trekLandmarks;
    }

    public String getTrekCampsiteInfo() {
        return trekCampsiteInfo;
    }

    public String getTrekTerrain() {
        return trekTerrain;
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

    public Trek(String trekType, String trekDescription, String trekDifficultyLevel, boolean trekGuidedOrNot,
                String trekPhysicalRequirements, String trekTips, String trekLandmarks, String trekCampsiteInfo,
                String trekTerrain, String trekTransportation, String nearbyActivities, String trekCost,
                String trekLength, String trekReviews) {
        this.trekType = trekType;
        this.trekDescription = trekDescription;
        this.trekDifficultyLevel = trekDifficultyLevel;
        this.trekGuidedOrNot = trekGuidedOrNot;
        this.trekPhysicalRequirements = trekPhysicalRequirements;
        this.trekTips = trekTips;

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

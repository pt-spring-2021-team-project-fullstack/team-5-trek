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
    

    public Trek(String trekType, String trekDescription, String trekDifficultyLevel) {
        this.trekType = trekType;
        this.trekDescription = trekDescription;
        this.trekDifficultyLevel = trekDifficultyLevel;
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

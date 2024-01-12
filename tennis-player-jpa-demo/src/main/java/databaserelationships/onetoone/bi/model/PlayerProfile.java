package databaserelationships.onetoone.bi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

// Bidirectional relationships are better than unidirectional relationships in terms of performance as both ends of the relationship are aware of any changes.

//When using bidirectional relationships, consistency must be ensured. If a Player object references a PlayerProfile object, the same PlayerProfile object
// must reference back to the Player object. Failure to ensure consistency can lead to unpredictable JPA behavior.

//A con of having bidirectional association is that it may make the application vulnerable in terms of security since the referenced side can now be used
// to access the owning side (we can access the Player object using the PlayerProfile object). Infinite recursion is also an issue when using bidirectional
// relationships with Jackson, Hibernate JPA, and/or Elasticsearch implementations.

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PlayerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String twitter;

    @OneToOne(mappedBy= "playerProfile", cascade= CascadeType.ALL)
    //@JsonBackReference
    private Player player;

    public PlayerProfile() {
    }

    public PlayerProfile(String twitter) {
        super();
        this.twitter = twitter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "PlayerDetail [id=" + id + ", twitter=" + twitter + ", player=" + player + "]";
    }
}
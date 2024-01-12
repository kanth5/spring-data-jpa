package databaserelationships.onetoone.uni.model;

import jakarta.persistence.*;

// Hibernate supports three variations of the @OneToOne mapping.

// Using foreign key with the @JoinColumn annotation.

// Using a common join table which has foreign keys of both tables. The @JoinTable annotation defines a new table name which has the foreign key from both tables.
// This helps in modelling optional one-to-one relationships. If a player does not have a PlayerProfile entry, we have to use null value in that column.

// Using a shared primary key to save space. This approach uses a common primary key (player_id in this case) in both tables using the @PrimaryKeyJoinColumn.
// It eliminates the need of having an Id column for the player_profile table.

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)//, optional = false)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private PlayerProfile playerProfile;

    public Player() {

    }

    public Player(String name) {
        super();
        this.name = name;
    }

    public Player(String name, PlayerProfile profile) {
        super();
        this.name = name;
        this.playerProfile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }

    public void setPlayerProfile(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", playerProfile=" + playerProfile + "]";
    }

}
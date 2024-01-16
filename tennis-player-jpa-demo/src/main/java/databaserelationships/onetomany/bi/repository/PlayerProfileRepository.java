package databaserelationships.onetomany.bi.repository;

import databaserelationships.onetomany.bi.models.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {

}
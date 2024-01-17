package databaserelationships.manytomany.bi.repository;

import databaserelationships.manytomany.bi.models.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {

}
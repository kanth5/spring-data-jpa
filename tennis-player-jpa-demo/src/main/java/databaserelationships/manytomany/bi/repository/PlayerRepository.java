package databaserelationships.manytomany.bi.repository;

import databaserelationships.manytomany.bi.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}


package databaserelationships.onetoone.uni.repository;

import databaserelationships.onetoone.uni.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}


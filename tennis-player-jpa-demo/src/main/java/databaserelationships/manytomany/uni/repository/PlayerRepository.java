package databaserelationships.manytomany.uni.repository;


import databaserelationships.manytomany.uni.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}


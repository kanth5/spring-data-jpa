package databaserelationships.onetomany.bi.repository;

import databaserelationships.onetomany.bi.models.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer> {

}
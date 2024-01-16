package databaserelationships.onetomany.bi.repository;

import databaserelationships.onetomany.bi.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
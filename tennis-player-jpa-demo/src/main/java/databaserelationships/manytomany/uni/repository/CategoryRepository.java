package databaserelationships.manytomany.uni.repository;

import databaserelationships.manytomany.uni.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
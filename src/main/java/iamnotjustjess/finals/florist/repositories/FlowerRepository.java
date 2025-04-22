package iamnotjustjess.finals.florist.repositories;

import iamnotjustjess.finals.florist.models.entities.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}

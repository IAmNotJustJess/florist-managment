package bb.aplikacje.kwiaciarnia.repositories;

import bb.aplikacje.kwiaciarnia.models.entities.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}

package iamnotjustjess.finals.florist.repositories;

import iamnotjustjess.finals.florist.models.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}

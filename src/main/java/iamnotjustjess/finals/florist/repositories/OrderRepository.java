package iamnotjustjess.finals.florist.repositories;

import iamnotjustjess.finals.florist.models.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}

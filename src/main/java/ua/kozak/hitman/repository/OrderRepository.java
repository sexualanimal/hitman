package ua.kozak.hitman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kozak.hitman.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

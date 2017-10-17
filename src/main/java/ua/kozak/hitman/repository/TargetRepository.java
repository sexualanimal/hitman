package ua.kozak.hitman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kozak.hitman.entity.Target;

public interface TargetRepository extends JpaRepository<Target, Long> {
}

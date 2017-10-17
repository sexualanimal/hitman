package ua.kozak.hitman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kozak.hitman.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

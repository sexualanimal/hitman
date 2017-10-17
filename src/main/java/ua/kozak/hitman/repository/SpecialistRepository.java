package ua.kozak.hitman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kozak.hitman.entity.Specialist;

public interface SpecialistRepository extends JpaRepository<Specialist, Long> {

    Specialist findByName(String userName);

}

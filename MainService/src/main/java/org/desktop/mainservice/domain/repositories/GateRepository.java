package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.Gate;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface GateRepository extends JpaRepository<Gate, Integer> {

    Optional<Gate> findByGateName(String gateName);

    boolean existsByGateName(String gateName);
}
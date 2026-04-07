package org.desktop.userservice.domain.repositories;

import org.desktop.userservice.domain.entity.Gate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GateRepository extends JpaRepository<Gate, Integer> {

    Optional<Gate> findByGateName(String gateName);
}
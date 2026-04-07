package org.desktop.userservice.domain.repositories;

import org.desktop.userservice.domain.entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AircraftRepository extends JpaRepository<Aircraft, Integer> {

    List<Aircraft> findByCompanyId(Integer companyId);
}
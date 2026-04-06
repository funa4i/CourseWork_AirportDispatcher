package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AircraftRepository extends JpaRepository<Aircraft, Integer> {
    List<Aircraft> findByCompanyId(Integer companyId);

    List<Aircraft> findByCapacityGreaterThan(Integer capacity);

    List<Aircraft> findByAircraftType(String aircraftType);
}
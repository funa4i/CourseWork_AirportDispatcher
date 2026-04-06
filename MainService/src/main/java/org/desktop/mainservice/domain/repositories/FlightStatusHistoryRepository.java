package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.FlightStatusHistory;
import org.desktop.mainservice.domain.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FlightStatusHistoryRepository extends JpaRepository<FlightStatusHistory, Integer> {

    List<FlightStatusHistory> findByFlightIdOrderByTimeDesc(Integer flightId);

    List<FlightStatusHistory> findByUserId(Integer userId);

    List<FlightStatusHistory> findByStatus(Status status);
}
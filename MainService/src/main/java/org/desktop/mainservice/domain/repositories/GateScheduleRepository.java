package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.GateSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface GateScheduleRepository extends JpaRepository<GateSchedule, Integer> {

    List<GateSchedule> findByGateId(Integer gateId);

    List<GateSchedule> findByFlightId(Integer flightId);

    List<GateSchedule> findByStartDateBetween(LocalDateTime start, LocalDateTime end);

    List<GateSchedule> findByEndDateBetween(LocalDateTime start, LocalDateTime end);
}
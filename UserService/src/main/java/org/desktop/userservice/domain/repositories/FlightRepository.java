package org.desktop.userservice.domain.repositories;

import org.desktop.userservice.domain.entity.Flight;
import org.desktop.userservice.domain.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    Optional<Flight> findByFlightNumber(String flightNumber);

    List<Flight> findByRouteId(Integer routeId);

    List<Flight> findByStatus(Status status);

    List<Flight> findByGateScheduleId(Integer gateScheduleId);

    List<Flight> findByScheduledDepartureBetween(LocalDateTime start, LocalDateTime end);
}
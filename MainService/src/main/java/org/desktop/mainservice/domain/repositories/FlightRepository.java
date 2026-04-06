package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    Optional<Flight> findByFlightNumber(String flightNumber);

    List<Flight> findByRouteId(Integer routeId);

    List<Flight> findByScheduledDepartureBetween(LocalDateTime start, LocalDateTime end);

    List<Flight> findByScheduledArrivalBetween(LocalDateTime start, LocalDateTime end);
}
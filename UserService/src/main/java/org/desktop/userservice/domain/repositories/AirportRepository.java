package org.desktop.userservice.domain.repositories;

import org.desktop.userservice.domain.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AirportRepository extends JpaRepository<Airport, Integer> {

    Optional<Airport> findByIata(String iata);

    Optional<Airport> findByIcao(String icao);
}
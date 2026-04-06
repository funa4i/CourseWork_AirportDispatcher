package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AirportRepository extends JpaRepository<Airport, Integer> {

    Optional<Airport> findByIata(String iata);

    Optional<Airport> findByIcao(String icao);

    boolean existsByIata(String iata);

    boolean existsByIcao(String icao);
}
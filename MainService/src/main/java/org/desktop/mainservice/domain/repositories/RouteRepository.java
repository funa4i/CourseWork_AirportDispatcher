package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.Route;
import org.desktop.mainservice.domain.enums.FlyType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface RouteRepository extends JpaRepository<Route, Integer> {

    List<Route> findByAirportId(Integer airportId);

    List<Route> findByAircraftId(Integer aircraftId);

    List<Route> findByFlyType(FlyType flyType);
}
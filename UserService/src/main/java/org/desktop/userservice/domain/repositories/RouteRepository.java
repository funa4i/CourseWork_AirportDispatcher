package org.desktop.userservice.domain.repositories;

import org.desktop.userservice.domain.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route, Integer> {

    List<Route> findByAirportId(Integer airportId);

    List<Route> findByAircraftId(Integer aircraftId);

    List<Route> findByFlyType(Route.FlyType flyType);
}
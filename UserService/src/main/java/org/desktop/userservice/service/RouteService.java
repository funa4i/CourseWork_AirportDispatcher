package org.desktop.userservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.userservice.domain.entity.Route;
import org.desktop.userservice.domain.enums.FlyType;
import org.desktop.userservice.domain.repositories.RouteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RouteService {

    private final RouteRepository repository;

    public Route getById(Integer id) {
        log.info("get Route by id");
        return repository.findById(id).orElse(null);
    }

    public List<Route> getAll() {
        log.info("get all Routes");
        return repository.findAll();
    }

    public List<Route> getByAirportId(Integer airportId) {
        log.info("get Routes by airportId");
        return repository.findByAirportId(airportId);
    }

    public List<Route> getByAircraftId(Integer aircraftId) {
        log.info("get Routes by aircraftId");
        return repository.findByAircraftId(aircraftId);
    }

    public List<Route> getByFlyType(FlyType flyType) {
        log.info("get Routes by flyType");
        return repository.findByFlyType(flyType);
    }
}
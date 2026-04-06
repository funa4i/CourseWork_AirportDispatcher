package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.Flight;
import org.desktop.mainservice.domain.repositories.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    public Flight create(Flight entity) {
        log.info("create Flight");
        return null;
    }

    public Flight getById(Integer id) {
        log.info("get Flight by id");
        return null;
    }

    public List<Flight> getAll() {
        log.info("get all Flights");
        return null;
    }

    public Flight update(Integer id, Flight entity) {
        log.info("update Flight");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Flight");
    }
}
package org.desktop.userservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.userservice.domain.entity.Flight;
import org.desktop.userservice.domain.enums.Status;
import org.desktop.userservice.domain.repositories.FlightRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FlightService {

    private final FlightRepository repository;

    public Flight getById(Integer id) {
        log.info("get Flight by id");
        return repository.findById(id).orElse(null);
    }

    public List<Flight> getAll() {
        log.info("get all Flights");
        return repository.findAll();
    }

    public Flight getByNumber(String number) {
        log.info("get Flight by number");
        return repository.findByFlightNumber(number).orElse(null);
    }

    public List<Flight> getByRouteId(Integer routeId) {
        log.info("get Flights by routeId");
        return repository.findByRouteId(routeId);
    }

    public List<Flight> getByStatus(Status status) {
        log.info("get Flights by status");
        return repository.findByStatus(status);
    }

    public List<Flight> getByGateScheduleId(Integer gateScheduleId) {
        log.info("get Flights by gateScheduleId");
        return repository.findByGateScheduleId(gateScheduleId);
    }

    public List<Flight> getByDeparturePeriod(LocalDateTime start, LocalDateTime end) {
        log.info("get Flights by departure period");
        return repository.findByScheduledDepartureBetween(start, end);
    }
}
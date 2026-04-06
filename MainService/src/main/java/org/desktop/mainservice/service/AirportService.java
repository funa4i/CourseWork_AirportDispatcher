package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.Airport;
import org.desktop.mainservice.domain.repositories.AirportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class AirportService {

    private final AirportRepository airportRepository;

    public Airport create(Airport entity) {
        log.info("create Airport");
        return null;
    }

    public Airport getById(Integer id) {
        log.info("get Airport by id");
        return null;
    }

    public List<Airport> getAll() {
        log.info("get all Airports");
        return null;
    }

    public Airport update(Integer id, Airport entity) {
        log.info("update Airport");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Airport");
    }
}
package org.desktop.userservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.userservice.domain.entity.Airport;
import org.desktop.userservice.domain.repositories.AirportRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AirportService {

    private final AirportRepository repository;

    public Airport getById(Integer id) {
        log.info("get Airport by id");
        return repository.findById(id).orElse(null);
    }

    public List<Airport> getAll() {
        log.info("get all Airports");
        return repository.findAll();
    }

    public Airport getByIata(String iata) {
        log.info("get Airport by iata");
        return repository.findByIata(iata).orElse(null);
    }

    public Airport getByIcao(String icao) {
        log.info("get Airport by icao");
        return repository.findByIcao(icao).orElse(null);
    }
}
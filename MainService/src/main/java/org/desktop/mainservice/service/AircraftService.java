package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.Aircraft;
import org.desktop.mainservice.domain.repositories.AircraftRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class AircraftService {

    private final AircraftRepository aircraftRepository;

    public Aircraft create(Aircraft entity) {
        log.info("create Aircraft");
        return null;
    }

    public Aircraft getById(Integer id) {
        log.info("get Aircraft by id");
        return null;
    }

    public List<Aircraft> getAll() {
        log.info("get all Aircraft");
        return null;
    }

    public Aircraft update(Integer id, Aircraft entity) {
        log.info("update Aircraft");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Aircraft");
    }
}
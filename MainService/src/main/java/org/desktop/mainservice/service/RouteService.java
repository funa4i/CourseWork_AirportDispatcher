package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.Route;
import org.desktop.mainservice.domain.repositories.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class RouteService {

    private final RouteRepository routeRepository;

    public Route create(Route entity) {
        log.info("create Route");
        return null;
    }

    public Route getById(Integer id) {
        log.info("get Route by id");
        return null;
    }

    public List<Route> getAll() {
        log.info("get all Routes");
        return null;
    }

    public Route update(Integer id, Route entity) {
        log.info("update Route");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Route");
    }
}
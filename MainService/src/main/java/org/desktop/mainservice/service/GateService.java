package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.Gate;
import org.desktop.mainservice.domain.repositories.GateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class GateService {

    private final GateRepository gateRepository;

    public Gate create(Gate entity) {
        log.info("create Gate");
        return null;
    }

    public Gate getById(Integer id) {
        log.info("get Gate by id");
        return null;
    }

    public List<Gate> getAll() {
        log.info("get all Gates");
        return null;
    }

    public Gate update(Integer id, Gate entity) {
        log.info("update Gate");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Gate");
    }
}
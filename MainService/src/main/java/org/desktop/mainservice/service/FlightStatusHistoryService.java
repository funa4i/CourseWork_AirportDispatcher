package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.FlightStatusHistory;
import org.desktop.mainservice.domain.repositories.FlightStatusHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class FlightStatusHistoryService {

    private final FlightStatusHistoryRepository repository;

    public FlightStatusHistory create(FlightStatusHistory entity) {
        log.info("create FlightStatusHistory");
        return null;
    }

    public FlightStatusHistory getById(Integer id) {
        log.info("get FlightStatusHistory by id");
        return null;
    }

    public List<FlightStatusHistory> getAll() {
        log.info("get all FlightStatusHistory");
        return null;
    }

    public FlightStatusHistory update(Integer id, FlightStatusHistory entity) {
        log.info("update FlightStatusHistory");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete FlightStatusHistory");
    }
}
package org.desktop.userservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.userservice.domain.entity.DelayAlert;
import org.desktop.userservice.domain.repositories.DelayAlertRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DelayAlertService {

    private final DelayAlertRepository repository;

    public DelayAlert getById(Integer id) {
        log.info("get DelayAlert by id");
        return repository.findById(id).orElse(null);
    }

    public List<DelayAlert> getAll() {
        log.info("get all DelayAlerts");
        return repository.findAll();
    }

    public List<DelayAlert> getByFlightId(Integer flightId) {
        log.info("get DelayAlerts by flightId");
        return repository.findByFlightId(flightId);
    }

    public List<DelayAlert> getWithDelayGreaterThan(Integer minutes) {
        log.info("get DelayAlerts by delayMinutes > value");
        return repository.findByDelayMinutesGreaterThan(minutes);
    }
}
package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.DelayAlert;
import org.desktop.mainservice.domain.repositories.DelayAlertRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class DelayAlertService {

    private final DelayAlertRepository repository;

    public DelayAlert create(DelayAlert entity) {
        log.info("create DelayAlert");
        return null;
    }

    public DelayAlert getById(Integer id) {
        log.info("get DelayAlert by id");
        return null;
    }

    public List<DelayAlert> getAll() {
        log.info("get all DelayAlerts");
        return null;
    }

    public DelayAlert update(Integer id, DelayAlert entity) {
        log.info("update DelayAlert");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete DelayAlert");
    }
}
package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.EmailStatistic;
import org.desktop.mainservice.domain.repositories.EmailStatisticRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class EmailStatisticService {

    private final EmailStatisticRepository repository;

    public EmailStatistic create(EmailStatistic entity) {
        log.info("create EmailStatistic");
        return null;
    }

    public EmailStatistic getById(Integer id) {
        log.info("get EmailStatistic by id");
        return null;
    }

    public List<EmailStatistic> getAll() {
        log.info("get all EmailStatistics");
        return null;
    }

    public EmailStatistic update(Integer id, EmailStatistic entity) {
        log.info("update EmailStatistic");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete EmailStatistic");
    }
}
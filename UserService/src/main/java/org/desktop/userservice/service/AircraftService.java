package org.desktop.userservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.userservice.domain.entity.Aircraft;
import org.desktop.userservice.domain.repositories.AircraftRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AircraftService {

    private final AircraftRepository repository;

    public Aircraft getById(Integer id) {
        log.info("get Aircraft by id");
        return repository.findById(id).orElse(null);
    }

    public List<Aircraft> getAll() {
        log.info("get all Aircraft");
        return repository.findAll();
    }

    public List<Aircraft> getByCompanyId(Integer companyId) {
        log.info("get Aircraft by companyId");
        return repository.findByCompanyId(companyId);
    }
}
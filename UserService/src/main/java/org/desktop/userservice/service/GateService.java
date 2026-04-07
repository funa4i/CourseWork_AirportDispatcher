package org.desktop.userservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.userservice.domain.entity.Gate;
import org.desktop.userservice.domain.repositories.GateRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GateService {

    private final GateRepository repository;

    public Gate getById(Integer id) {
        log.info("get Gate by id");
        return repository.findById(id).orElse(null);
    }

    public List<Gate> getAll() {
        log.info("get all Gates");
        return repository.findAll();
    }

    public Gate getByName(String name) {
        log.info("get Gate by name");
        return repository.findByGateName(name).orElse(null);
    }
}
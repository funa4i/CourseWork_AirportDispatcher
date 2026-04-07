package org.desktop.userservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.userservice.domain.entity.Company;
import org.desktop.userservice.domain.repositories.CompanyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CompanyService {

    private final CompanyRepository repository;

    public Company getById(Integer id) {
        log.info("get Company by id");
        return repository.findById(id).orElse(null);
    }

    public List<Company> getAll() {
        log.info("get all Companies");
        return repository.findAll();
    }

    public Company getByIata(String iata) {
        log.info("get Company by iata");
        return repository.findByIataCode(iata).orElse(null);
    }

    public Company getByIcao(String icao) {
        log.info("get Company by icao");
        return repository.findByIcaoCode(icao).orElse(null);
    }
}
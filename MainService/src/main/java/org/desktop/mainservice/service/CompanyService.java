package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.Company;
import org.desktop.mainservice.domain.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Company create(Company entity) {
        log.info("create Company");
        return null;
    }

    public Company getById(Integer id) {
        log.info("get Company by id");
        return null;
    }

    public List<Company> getAll() {
        log.info("get all Companies");
        return null;
    }

    public Company update(Integer id, Company entity) {
        log.info("update Company");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Company");
    }
}
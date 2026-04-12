package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.CompanyBinding;
import org.desktop.desktopapplication.domain.dto.view.CompanyView;
import org.desktop.desktopapplication.feign.interfaces.CompanyFeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyFeignClient companyFeignClient;

    public CompanyView create(CompanyBinding binding) {
        log.info("Creating company: {}", binding);
        CompanyView response = companyFeignClient.create(binding);
        log.info("Company created: {}", response);
        return response;
    }

    public CompanyView getById(Integer id) {
        log.info("Getting company by id: {}", id);
        CompanyView response = companyFeignClient.getById(id);
        log.info("Company received: {}", response);
        return response;
    }

    public List<CompanyView> getAll() {
        log.info("Getting all companies");
        List<CompanyView> response = companyFeignClient.getAll();
        log.info("Company list received, count: {}", response.size());
        return response;
    }
}
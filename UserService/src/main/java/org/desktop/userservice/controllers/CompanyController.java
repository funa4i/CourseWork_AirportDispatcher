package org.desktop.userservice.controllers;

import lombok.RequiredArgsConstructor;
import org.desktop.userservice.domain.dto.views.CompanyView;
import org.desktop.userservice.service.CompanyService;
import org.desktop.userservice.utils.mappers.CompanyMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService service;
    private final CompanyMapper mapper;

    @GetMapping("/{id}")
    public CompanyView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<CompanyView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
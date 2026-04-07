package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.CompanyBinding;
import org.desktop.mainservice.domain.dto.view.CompanyView;
import org.desktop.mainservice.domain.entities.Company;
import org.desktop.mainservice.domain.repositories.CompanyRepository;
import org.desktop.mainservice.service.CompanyService;
import org.desktop.mainservice.util.mapper.CompanyMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService service;
    private final CompanyMapper mapper;

    @PostMapping
    public CompanyView create(@RequestBody @Valid CompanyBinding binding) {
        Company entity = mapper.toEntity(binding);
        return mapper.toView(service.create(entity));
    }

    @GetMapping("/{id}")
    public CompanyView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<CompanyView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
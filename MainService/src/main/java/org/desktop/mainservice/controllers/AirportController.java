package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.AirportBinding;
import org.desktop.mainservice.domain.dto.view.AirportView;
import org.desktop.mainservice.domain.entities.Airport;
import org.desktop.mainservice.domain.repositories.AirportRepository;
import org.desktop.mainservice.service.AirportService;
import org.desktop.mainservice.util.mapper.AirportMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
@RequiredArgsConstructor
public class AirportController {

    private final AirportService service;
    private final AirportMapper mapper;

    @PostMapping
    public AirportView create(@RequestBody @Valid AirportBinding binding) {
        Airport entity = mapper.toEntity(binding);
        return mapper.toView(service.create(entity));
    }

    @GetMapping("/{id}")
    public AirportView getById(@PathVariable Integer id) {
        return mapper.toView( service.getById(id));
    }

    @GetMapping
    public List<AirportView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
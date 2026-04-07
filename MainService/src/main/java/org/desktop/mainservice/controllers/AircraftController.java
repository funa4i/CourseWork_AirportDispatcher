package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.AircraftBinding;
import org.desktop.mainservice.domain.dto.view.AircraftView;
import org.desktop.mainservice.domain.entities.Aircraft;
import org.desktop.mainservice.domain.repositories.AircraftRepository;
import org.desktop.mainservice.service.AircraftService;
import org.desktop.mainservice.util.mapper.AircraftMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aircraft")
@RequiredArgsConstructor
public class AircraftController {

    private final AircraftService service;
    private final AircraftMapper mapper;

    @PostMapping
    public AircraftView create(@RequestBody @Valid AircraftBinding binding) {
        Aircraft entity = mapper.toEntity(binding);
        return mapper.toView(service.create(entity));
    }

    @GetMapping("/{id}")
    public AircraftView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<AircraftView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
package org.desktop.userservice.controllers;

import lombok.RequiredArgsConstructor;
import org.desktop.userservice.domain.dto.views.AircraftView;
import org.desktop.userservice.service.AircraftService;
import org.desktop.userservice.utils.mappers.AircraftMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/aircraft")
@RequiredArgsConstructor
public class AircraftController {

    private final AircraftService service;
    private final AircraftMapper mapper;

    @GetMapping("/{id}")
    public AircraftView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<AircraftView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
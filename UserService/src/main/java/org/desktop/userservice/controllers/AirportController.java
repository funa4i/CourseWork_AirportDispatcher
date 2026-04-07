package org.desktop.userservice.controllers;

import lombok.RequiredArgsConstructor;
import org.desktop.userservice.domain.dto.views.AirportView;
import org.desktop.userservice.service.AirportService;
import org.desktop.userservice.utils.mappers.AirportMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
@RequiredArgsConstructor
public class AirportController {

    private final AirportService service;
    private final AirportMapper mapper;

    @GetMapping("/{id}")
    public AirportView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<AirportView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
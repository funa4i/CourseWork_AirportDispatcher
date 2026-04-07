package org.desktop.userservice.controllers;

import lombok.RequiredArgsConstructor;
import org.desktop.userservice.domain.dto.views.FlightView;
import org.desktop.userservice.service.FlightService;
import org.desktop.userservice.utils.mappers.FlightMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService service;
    private final FlightMapper mapper;

    @GetMapping("/{id}")
    public FlightView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<FlightView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
package org.desktop.userservice.controllers;

import lombok.RequiredArgsConstructor;
import org.desktop.userservice.domain.dto.views.RouteView;
import org.desktop.userservice.service.RouteService;
import org.desktop.userservice.utils.mappers.RouteMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/routes")
@RequiredArgsConstructor
public class RouteController {

    private final RouteService service;
    private final RouteMapper mapper;

    @GetMapping("/{id}")
    public RouteView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<RouteView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
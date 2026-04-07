package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.RouteBinding;
import org.desktop.mainservice.domain.dto.view.RouteView;
import org.desktop.mainservice.domain.entities.Route;
import org.desktop.mainservice.domain.repositories.RouteRepository;
import org.desktop.mainservice.service.RouteService;
import org.desktop.mainservice.util.mapper.RouteMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routes")
@RequiredArgsConstructor
public class RouteController {

    private final RouteService service;
    private final RouteMapper mapper;

    @PostMapping
    public RouteView create(@RequestBody @Valid RouteBinding binding) {
        Route entity = mapper.toEntity(binding);
        return mapper.toView(service.create(entity));
    }

    @GetMapping("/{id}")
    public RouteView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<RouteView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
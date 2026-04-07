package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.GateBinding;
import org.desktop.mainservice.domain.dto.view.GateView;
import org.desktop.mainservice.domain.entities.Gate;
import org.desktop.mainservice.domain.repositories.GateRepository;
import org.desktop.mainservice.service.GateService;
import org.desktop.mainservice.util.mapper.GateMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gates")
@RequiredArgsConstructor
public class GateController {

    private final GateService service;
    private final GateMapper mapper;

    @PostMapping
    public GateView create(@RequestBody @Valid GateBinding binding) {
        Gate entity = mapper.toEntity(binding);
        return mapper.toView(service.create(entity));
    }

    @GetMapping("/{id}")
    public GateView getById(@PathVariable Integer id) {
        return mapper.toView( service.getById(id));
    }

    @GetMapping
    public List<GateView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
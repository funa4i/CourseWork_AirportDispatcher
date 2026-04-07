package org.desktop.userservice.controllers;

import lombok.RequiredArgsConstructor;
import org.desktop.userservice.domain.dto.views.GateView;
import org.desktop.userservice.service.GateService;
import org.desktop.userservice.utils.mappers.GateMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gates")
@RequiredArgsConstructor
public class GateController {

    private final GateService service;
    private final GateMapper mapper;

    @GetMapping("/{id}")
    public GateView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<GateView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
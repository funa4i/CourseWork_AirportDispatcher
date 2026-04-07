package org.desktop.userservice.controllers;

import lombok.RequiredArgsConstructor;
import org.desktop.userservice.domain.dto.views.DelayAlertView;
import org.desktop.userservice.service.DelayAlertService;
import org.desktop.userservice.utils.mappers.DelayAlertMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/delay-alerts")
@RequiredArgsConstructor
public class DelayAlertController {

    private final DelayAlertService service;
    private final DelayAlertMapper mapper;

    @GetMapping("/{id}")
    public DelayAlertView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<DelayAlertView> getAll() {
        return mapper.toViewList(service.getAll());
    }
}
package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.GateScheduleBinding;
import org.desktop.mainservice.domain.dto.view.GateScheduleView;
import org.desktop.mainservice.domain.entities.GateSchedule;
import org.desktop.mainservice.domain.repositories.GateScheduleRepository;
import org.desktop.mainservice.service.GateScheduleService;
import org.desktop.mainservice.service.GateService;
import org.desktop.mainservice.util.mapper.GateScheduleMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gate-schedules")
@RequiredArgsConstructor
public class GateScheduleController {

    private final GateScheduleService service;
    private final GateScheduleMapper mapper;

    @PostMapping
    public GateScheduleView create(@RequestBody @Valid GateScheduleBinding binding) {
        GateSchedule entity = mapper.toEntity(binding);
        return mapper.toView(service.create(entity));
    }

    @GetMapping("/{id}")
    public GateScheduleView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<GateScheduleView> getAll() {
        return mapper.toViewList(service.getAll());
    }

    @PutMapping("/{id}")
    public GateScheduleView update(@PathVariable Integer id,
                                   @RequestBody @Valid GateScheduleBinding binding) {
        GateSchedule entity = mapper.toEntity(binding);
        entity.setId(id);
        return mapper.toView(service.update(entity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.ChangeStatusBinding;
import org.desktop.mainservice.domain.dto.binding.FlightBinding;
import org.desktop.mainservice.domain.dto.view.FlightView;
import org.desktop.mainservice.domain.entities.Flight;
import org.desktop.mainservice.domain.repositories.FlightRepository;
import org.desktop.mainservice.service.FlightService;
import org.desktop.mainservice.util.mapper.FlightMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService service;
    private final FlightMapper mapper;

    @PostMapping
    public FlightView create(@RequestBody @Valid FlightBinding binding) {
        Flight entity = mapper.toEntity(binding);
        return mapper.toView(service.create(entity));
    }

    @GetMapping("/{id}")
    public FlightView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping
    public List<FlightView> getAll() {
        return mapper.toViewList(service.getAll());
    }

    @PutMapping("/{id}")
    public FlightView update(@PathVariable Integer id,
                             @RequestBody @Valid FlightBinding binding) {
        Flight entity = mapper.toEntity(binding);
        entity.setId(id);
        return mapper.toView(service.update(entity));
    }

    @PatchMapping("/{id}/status")
    public void changeStatus(@PathVariable Integer id,
                             @RequestBody @Valid ChangeStatusBinding binding) {
        service.changeStatus(
                id,
                binding.getStatus(),
                binding.getUserId(),
                binding.getComment(),
                binding.getDelayMinutes()
        );
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
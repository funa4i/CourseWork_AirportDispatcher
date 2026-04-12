package org.desktop.desktopapplication.feign.interfaces;

import org.desktop.desktopapplication.domain.dto.binding.AircraftBinding;
import org.desktop.desktopapplication.domain.dto.view.AircraftView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "aircraftClient", url = "${api.base-url}")
public interface AircraftFeignClient {

    @PostMapping("/api/aircraft")
    AircraftView create(@RequestBody AircraftBinding binding);

    @GetMapping("/api/aircraft/{id}")
    AircraftView getById(@PathVariable("id") Integer id);

    @GetMapping("/api/aircraft")
    List<AircraftView> getAll();
}
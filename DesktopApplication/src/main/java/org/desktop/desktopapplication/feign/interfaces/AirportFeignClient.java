package org.desktop.desktopapplication.feign.interfaces;


import org.desktop.desktopapplication.domain.dto.binding.AirportBinding;
import org.desktop.desktopapplication.domain.dto.view.AirportView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "airportClient", url = "${api.base-url}")
public interface AirportFeignClient {

    @PostMapping("/api/airports")
    AirportView create(@RequestBody AirportBinding binding);

    @GetMapping("/api/airports/{id}")
    AirportView getById(@PathVariable("id") Integer id);

    @GetMapping("/api/airports")
    List<AirportView> getAll();
}
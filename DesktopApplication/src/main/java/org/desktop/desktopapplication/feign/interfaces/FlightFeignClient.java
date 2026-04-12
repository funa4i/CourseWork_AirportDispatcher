package org.desktop.desktopapplication.feign.interfaces;

import org.desktop.desktopapplication.domain.dto.binding.ChangeStatusBinding;
import org.desktop.desktopapplication.domain.dto.binding.FlightBinding;
import org.desktop.desktopapplication.domain.dto.view.FlightView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "flightClient", url = "${api.base-url}")
public interface FlightFeignClient {

    @PostMapping("/api/flights")
    FlightView create(@RequestBody FlightBinding binding);

    @GetMapping("/api/flights/{id}")
    FlightView getById(@PathVariable("id") Integer id);

    @GetMapping("/api/flights")
    List<FlightView> getAll();

    @PutMapping("/api/flights/{id}")
    FlightView update(@PathVariable("id") Integer id, @RequestBody FlightBinding binding);

    @PatchMapping("/api/flights/{id}/status")
    void changeStatus(@PathVariable("id") Integer id, @RequestBody ChangeStatusBinding binding);

    @DeleteMapping("/api/flights/{id}")
    void delete(@PathVariable("id") Integer id);
}
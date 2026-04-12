package org.desktop.desktopapplication.feign.interfaces;

import org.desktop.desktopapplication.domain.dto.binding.GateScheduleBinding;
import org.desktop.desktopapplication.domain.dto.view.GateScheduleView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "gateScheduleClient", url = "${api.base-url}")
public interface GateScheduleFeignClient {

    @PostMapping("/api/gate-schedules")
    GateScheduleView create(@RequestBody GateScheduleBinding binding);

    @GetMapping("/api/gate-schedules/{id}")
    GateScheduleView getById(@PathVariable("id") Integer id);

    @GetMapping("/api/gate-schedules")
    List<GateScheduleView> getAll();

    @PutMapping("/api/gate-schedules/{id}")
    GateScheduleView update(@PathVariable("id") Integer id, @RequestBody GateScheduleBinding binding);

    @DeleteMapping("/api/gate-schedules/{id}")
    void delete(@PathVariable("id") Integer id);
}
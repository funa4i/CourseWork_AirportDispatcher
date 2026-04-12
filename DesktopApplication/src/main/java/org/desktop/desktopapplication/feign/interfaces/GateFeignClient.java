package org.desktop.desktopapplication.feign.interfaces;

import org.desktop.desktopapplication.domain.dto.binding.GateBinding;
import org.desktop.desktopapplication.domain.dto.view.GateView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "gateClient", url = "${api.base-url}")
public interface GateFeignClient {

    @PostMapping("/api/gates")
    GateView create(@RequestBody GateBinding binding);

    @GetMapping("/api/gates/{id}")
    GateView getById(@PathVariable("id") Integer id);

    @GetMapping("/api/gates")
    List<GateView> getAll();
}
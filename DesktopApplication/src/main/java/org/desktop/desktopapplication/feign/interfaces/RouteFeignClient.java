package org.desktop.desktopapplication.feign.interfaces;

import org.desktop.desktopapplication.domain.dto.binding.RouteBinding;
import org.desktop.desktopapplication.domain.dto.view.RouteView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "routeClient", url = "${api.base-url}")
public interface RouteFeignClient {

    @PostMapping("/api/routes")
    RouteView create(@RequestBody RouteBinding binding);

    @GetMapping("/api/routes/{id}")
    RouteView getById(@PathVariable("id") Integer id);

    @GetMapping("/api/routes")
    List<RouteView> getAll();
}
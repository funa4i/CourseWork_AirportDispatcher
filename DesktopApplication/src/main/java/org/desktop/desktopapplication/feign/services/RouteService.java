package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.RouteBinding;
import org.desktop.desktopapplication.domain.dto.view.RouteView;
import org.desktop.desktopapplication.feign.interfaces.RouteFeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RouteService {

    private final RouteFeignClient routeFeignClient;

    public RouteView create(RouteBinding binding) {
        log.info("Creating route: {}", binding);
        RouteView response = routeFeignClient.create(binding);
        log.info("Route created: {}", response);
        return response;
    }

    public RouteView getById(Integer id) {
        log.info("Getting route by id: {}", id);
        RouteView response = routeFeignClient.getById(id);
        log.info("Route received: {}", response);
        return response;
    }

    public List<RouteView> getAll() {
        log.info("Getting all routes");
        List<RouteView> response = routeFeignClient.getAll();
        log.info("Route list received, count: {}", response.size());
        return response;
    }
}
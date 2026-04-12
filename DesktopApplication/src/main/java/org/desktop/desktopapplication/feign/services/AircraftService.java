package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.AircraftBinding;
import org.desktop.desktopapplication.domain.dto.view.AircraftView;
import org.desktop.desktopapplication.feign.interfaces.AircraftFeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AircraftService {

    private final AircraftFeignClient aircraftFeignClient;

    public AircraftView create(AircraftBinding binding) {
        log.info("Creating aircraft: {}", binding);
        AircraftView response = aircraftFeignClient.create(binding);
        log.info("Aircraft created: {}", response);
        return response;
    }

    public AircraftView getById(Integer id) {
        log.info("Getting aircraft by id: {}", id);
        AircraftView response = aircraftFeignClient.getById(id);
        log.info("Aircraft received: {}", response);
        return response;
    }

    public List<AircraftView> getAll() {
        log.info("Getting all aircraft");
        List<AircraftView> response = aircraftFeignClient.getAll();
        log.info("Aircraft list received, count: {}", response.size());
        return response;
    }
}
package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.AirportBinding;
import org.desktop.desktopapplication.domain.dto.view.AirportView;
import org.desktop.desktopapplication.feign.interfaces.AirportFeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AirportService {

    private final AirportFeignClient airportFeignClient;

    public AirportView create(AirportBinding binding) {
        log.info("Creating airport: {}", binding);
        AirportView response = airportFeignClient.create(binding);
        log.info("Airport created: {}", response);
        return response;
    }

    public AirportView getById(Integer id) {
        log.info("Getting airport by id: {}", id);
        AirportView response = airportFeignClient.getById(id);
        log.info("Airport received: {}", response);
        return response;
    }

    public List<AirportView> getAll() {
        log.info("Getting all airports");
        List<AirportView> response = airportFeignClient.getAll();
        log.info("Airport list received, count: {}", response.size());
        return response;
    }
}
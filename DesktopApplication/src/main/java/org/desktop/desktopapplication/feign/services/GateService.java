package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.GateBinding;
import org.desktop.desktopapplication.domain.dto.view.GateView;
import org.desktop.desktopapplication.feign.interfaces.GateFeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GateService {

    private final GateFeignClient gateFeignClient;

    public GateView create(GateBinding binding) {
        log.info("Creating gate: {}", binding);
        GateView response = gateFeignClient.create(binding);
        log.info("Gate created: {}", response);
        return response;
    }

    public GateView getById(Integer id) {
        log.info("Getting gate by id: {}", id);
        GateView response = gateFeignClient.getById(id);
        log.info("Gate received: {}", response);
        return response;
    }

    public List<GateView> getAll() {
        log.info("Getting all gates");
        List<GateView> response = gateFeignClient.getAll();
        log.info("Gate list received, count: {}", response.size());
        return response;
    }
}
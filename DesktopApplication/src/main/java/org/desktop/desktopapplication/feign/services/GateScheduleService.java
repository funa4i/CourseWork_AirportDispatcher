package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.GateScheduleBinding;
import org.desktop.desktopapplication.domain.dto.view.GateScheduleView;
import org.desktop.desktopapplication.feign.interfaces.GateScheduleFeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GateScheduleService {

    private final GateScheduleFeignClient gateScheduleFeignClient;

    public GateScheduleView create(GateScheduleBinding binding) {
        log.info("Creating gate schedule: {}", binding);
        GateScheduleView response = gateScheduleFeignClient.create(binding);
        log.info("Gate schedule created: {}", response);
        return response;
    }

    public GateScheduleView getById(Integer id) {
        log.info("Getting gate schedule by id: {}", id);
        GateScheduleView response = gateScheduleFeignClient.getById(id);
        log.info("Gate schedule received: {}", response);
        return response;
    }

    public List<GateScheduleView> getAll() {
        log.info("Getting all gate schedules");
        List<GateScheduleView> response = gateScheduleFeignClient.getAll();
        log.info("Gate schedule list received, count: {}", response.size());
        return response;
    }

    public GateScheduleView update(Integer id, GateScheduleBinding binding) {
        log.info("Updating gate schedule id: {}, payload: {}", id, binding);
        GateScheduleView response = gateScheduleFeignClient.update(id, binding);
        log.info("Gate schedule updated: {}", response);
        return response;
    }

    public void delete(Integer id) {
        log.info("Deleting gate schedule by id: {}", id);
        gateScheduleFeignClient.delete(id);
        log.info("Gate schedule deleted, id: {}", id);
    }
}
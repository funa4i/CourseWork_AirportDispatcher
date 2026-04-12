package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.ChangeStatusBinding;
import org.desktop.desktopapplication.domain.dto.binding.FlightBinding;
import org.desktop.desktopapplication.domain.dto.view.FlightView;
import org.desktop.desktopapplication.feign.interfaces.FlightFeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightFeignClient flightFeignClient;

    public FlightView create(FlightBinding binding) {
        log.info("Creating flight: {}", binding);
        FlightView response = flightFeignClient.create(binding);
        log.info("Flight created: {}", response);
        return response;
    }

    public FlightView getById(Integer id) {
        log.info("Getting flight by id: {}", id);
        FlightView response = flightFeignClient.getById(id);
        log.info("Flight received: {}", response);
        return response;
    }

    public List<FlightView> getAll() {
        log.info("Getting all flights");
        List<FlightView> response = flightFeignClient.getAll();
        log.info("Flight list received, count: {}", response.size());
        return response;
    }

    public FlightView update(Integer id, FlightBinding binding) {
        log.info("Updating flight id: {}, payload: {}", id, binding);
        FlightView response = flightFeignClient.update(id, binding);
        log.info("Flight updated: {}", response);
        return response;
    }

    public void changeStatus(Integer id, ChangeStatusBinding binding) {
        log.info("Changing flight status, id: {}, payload: {}", id, binding);
        flightFeignClient.changeStatus(id, binding);
        log.info("Flight status changed, id: {}", id);
    }

    public void delete(Integer id) {
        log.info("Deleting flight by id: {}", id);
        flightFeignClient.delete(id);
        log.info("Flight deleted, id: {}", id);
    }
}
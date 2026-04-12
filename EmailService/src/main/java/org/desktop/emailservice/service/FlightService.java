package org.desktop.emailservice.service;

import lombok.RequiredArgsConstructor;
import org.desktop.emailservice.feign.FlightFeign;
import org.desktop.emailservice.feign.dto.FlightView;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {
    private final FlightFeign flightFeign;

    public List<FlightView> getFlights(){
        return flightFeign.getAll("some");
    }
}

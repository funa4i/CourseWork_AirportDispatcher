package org.desktop.mainservice.domain.dto.view;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FlightView {

    private Integer id;
    private Integer routeId;
    private String flightNumber;
    private LocalDateTime scheduledDeparture;
    private LocalDateTime scheduledArrival;
}
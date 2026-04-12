package org.desktop.userservice.domain.dto.views;

import lombok.Data;

@Data
public class RouteView {

    private Integer id;
    private Integer airportId;
    private Integer aircraftId;
    private String flyType;
}
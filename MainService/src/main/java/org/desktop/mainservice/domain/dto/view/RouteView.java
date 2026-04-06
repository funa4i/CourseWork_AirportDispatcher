package org.desktop.mainservice.domain.dto.view;

import lombok.Data;

@Data
public class RouteView {

    private Integer id;
    private Integer airportId;
    private Integer aircraftId;
    private String flyType;
}
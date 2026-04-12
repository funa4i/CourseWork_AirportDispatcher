package org.desktop.desktopapplication.domain.dto.view;

import lombok.Data;

@Data
public class AirportView {

    private Integer id;
    private String iata;
    private String icao;
    private String name;
    private String city;
}
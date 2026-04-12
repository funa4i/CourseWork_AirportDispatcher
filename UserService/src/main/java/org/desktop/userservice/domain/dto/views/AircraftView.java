package org.desktop.userservice.domain.dto.views;

import lombok.Data;

@Data
public class AircraftView {

    private Integer id;
    private String name;
    private Integer capacity;
    private String aircraftType;
    private Integer companyId;
}
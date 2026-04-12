package org.desktop.desktopapplication.domain.dto.view;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FlightStatusHistoryView {

    private Integer id;
    private Integer flightId;
    private Integer userId;
    private LocalDateTime time;
    private String status;
    private String comment;
}
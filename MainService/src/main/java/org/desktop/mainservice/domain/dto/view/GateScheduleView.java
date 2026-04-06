package org.desktop.mainservice.domain.dto.view;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GateScheduleView {

    private Integer id;
    private Integer gateId;
    private Integer flightId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
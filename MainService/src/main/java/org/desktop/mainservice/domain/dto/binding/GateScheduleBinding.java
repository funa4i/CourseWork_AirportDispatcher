package org.desktop.mainservice.domain.dto.binding;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GateScheduleBinding {
    private Integer id;

    @NotNull
    private Integer gateId;

    @NotNull
    private Integer flightId;

    @NotNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime endDate;
}
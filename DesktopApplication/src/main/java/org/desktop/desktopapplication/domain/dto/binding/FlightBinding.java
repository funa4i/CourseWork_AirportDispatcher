package org.desktop.desktopapplication.domain.dto.binding;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FlightBinding {
    @NotNull
    private Integer routeId;

    @NotNull
    private LocalDateTime scheduledDeparture;

    @NotNull
    private LocalDateTime scheduledArrival;
}
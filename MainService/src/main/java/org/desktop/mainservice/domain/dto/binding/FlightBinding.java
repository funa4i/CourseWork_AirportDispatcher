package org.desktop.mainservice.domain.dto.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
package org.desktop.mainservice.domain.dto.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FlightBinding {
    private Integer id;

    @NotNull
    private Integer routeId;

    @NotBlank
    @Size(max = 10)
    private String flightNumber;

    @NotNull
    private LocalDateTime scheduledDeparture;

    @NotNull
    private LocalDateTime scheduledArrival;
}
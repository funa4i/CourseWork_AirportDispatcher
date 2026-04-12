package org.desktop.desktopapplication.domain.dto.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FlightStatusHistoryBinding {

    @NotNull
    private Integer flightId;

    private Integer userId;

    @NotNull
    private LocalDateTime time;

    @NotNull
    @Pattern(regexp = "scheduled|boarding|departed|arrived|delayed|cancelled")
    private String status;

    @Size(max = 255)
    private String comment;
}
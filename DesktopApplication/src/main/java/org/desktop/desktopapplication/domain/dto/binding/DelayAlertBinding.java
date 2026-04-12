package org.desktop.desktopapplication.domain.dto.binding;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DelayAlertBinding {
    @NotNull
    private Integer flightId;

    @NotNull
    @Min(0)
    private Integer delayMinutes;

    @Size(max = 255)
    private String message;
}
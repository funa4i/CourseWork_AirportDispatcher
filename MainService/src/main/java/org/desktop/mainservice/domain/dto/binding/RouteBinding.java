package org.desktop.mainservice.domain.dto.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class RouteBinding {
    @NotNull
    private Integer airportId;

    @NotNull
    private Integer aircraftId;

    @NotNull
    @Pattern(regexp = "arrival|departure")
    private String flyType;
}
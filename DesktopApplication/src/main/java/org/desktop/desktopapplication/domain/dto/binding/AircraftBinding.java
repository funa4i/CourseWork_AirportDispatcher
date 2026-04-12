package org.desktop.desktopapplication.domain.dto.binding;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AircraftBinding {

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotNull
    @Min(1)
    private Integer capacity;

    @Size(max = 50)
    private String aircraftType;

    @NotNull
    private Integer companyId;
}
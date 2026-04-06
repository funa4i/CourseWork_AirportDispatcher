package org.desktop.mainservice.domain.dto.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AirportBinding {

    @NotBlank
    @Size(min = 3, max = 3)
    private String iata;

    @NotBlank
    @Size(min = 4, max = 4)
    private String icao;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 100)
    private String city;
}
package org.desktop.desktopapplication.domain.dto.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CompanyBinding {

    @NotBlank
    @Size(min = 3, max = 3)
    private String iataCode;

    @NotBlank
    @Size(min = 4, max = 4)
    private String icaoCode;

    @Size(max = 10)
    private String tcldCode;

    @NotBlank
    @Size(max = 100)
    private String name;

    private Integer digitalCode;

    @NotBlank
    @Size(max = 100)
    private String country;
}
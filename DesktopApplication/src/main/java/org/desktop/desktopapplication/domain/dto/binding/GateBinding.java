package org.desktop.desktopapplication.domain.dto.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class GateBinding {

    @NotBlank
    @Size(max = 10)
    private String gateName;

    @NotBlank
    @Size(max = 10)
    private String terminal;
}
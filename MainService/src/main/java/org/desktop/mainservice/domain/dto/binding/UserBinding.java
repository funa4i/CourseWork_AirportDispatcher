package org.desktop.mainservice.domain.dto.binding;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserBinding {

    @NotBlank
    @Size(max = 50)
    private String username;

    @NotBlank
    @Size(max = 255)
    private String password;

    @Email
    private String email;

    @NotNull
    @Pattern(regexp = "admin|dispatcher")
    private String role;
}
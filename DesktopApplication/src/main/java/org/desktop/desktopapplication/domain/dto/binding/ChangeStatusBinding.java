package org.desktop.desktopapplication.domain.dto.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.desktop.mainservice.domain.enums.Status;
import org.desktop.mainservice.util.validation.ConsistentState;

@Data
@ConsistentState
public class ChangeStatusBinding {
    @NotNull
    private Status status;

    private Integer userId;

    @Size(max = 255)
    private String comment;

    private Integer delayMinutes;
}
package org.desktop.desktopapplication.domain.dto.view;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DelayAlertView {

    private Integer id;
    private Integer flightId;
    private LocalDateTime createdAt;
    private Integer delayMinutes;
    private String message;
}
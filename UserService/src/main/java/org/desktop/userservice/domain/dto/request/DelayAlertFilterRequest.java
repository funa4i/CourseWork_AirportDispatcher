package org.desktop.userservice.domain.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class DelayAlertFilterRequest extends BasePageRequest {
    private Integer id;
    private Integer flightId;
    private Integer minDelayMinutes;
    private Integer maxDelayMinutes;
    private String message;
    private LocalDateTime createdAtFrom;
    private LocalDateTime createdAtTo;
}

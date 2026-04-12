package org.desktop.userservice.domain.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class FlightFilterRequest extends BasePageRequest {
    private Integer id;
    private Integer routeId;
    private String flightNumber;
    private LocalDateTime scheduledDepartureFrom;
    private LocalDateTime scheduledDepartureTo;
    private LocalDateTime scheduledArrivalFrom;
    private LocalDateTime scheduledArrivalTo;
    private String status;
    private Integer gateId;
}

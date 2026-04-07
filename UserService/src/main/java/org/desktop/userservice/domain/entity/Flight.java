package org.desktop.userservice.domain.entity;

import jakarta.persistence.*;
import org.desktop.userservice.domain.enums.Status;

import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @Column(name = "flight_number", length = 10, nullable = false)
    private String flightNumber;

    @Column(name = "scheduled_departure", nullable = false)
    private LocalDateTime scheduledDeparture;

    @Column(name = "scheduled_arrival", nullable = false)
    private LocalDateTime scheduledArrival;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    // Обратная ссылка на GateSchedule (опциональная)
    @ManyToOne
    @JoinColumn(name = "gate_schedule_id")
    private GateSchedule gateSchedule;
}
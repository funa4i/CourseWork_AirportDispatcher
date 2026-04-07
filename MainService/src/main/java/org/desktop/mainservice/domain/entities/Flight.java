package org.desktop.mainservice.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.desktop.mainservice.domain.enums.Status;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;

    @Column(name = "flight_number", nullable = false, length = 10, unique = true)
    private String flightNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @OneToOne(optional = false, mappedBy = "flight")
    private GateSchedule gate;

    @Column(name = "scheduled_departure", nullable = false)
    private LocalDateTime scheduledDeparture;

    @Column(name = "scheduled_arrival", nullable = false)
    private LocalDateTime scheduledArrival;
}
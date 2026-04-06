package org.desktop.mainservice.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "gate_schedule")
public class GateSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "gate_id", nullable = false)
    private Gate gate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;
}
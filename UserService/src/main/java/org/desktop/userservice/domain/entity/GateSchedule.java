package org.desktop.userservice.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "gate_schedule")
public class GateSchedule {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "gate_id")
    private Gate gate;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "gateSchedule")
    private List<Flight> flights;
}
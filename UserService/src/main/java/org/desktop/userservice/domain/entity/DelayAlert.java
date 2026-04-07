package org.desktop.userservice.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "delay_alert")
public class DelayAlert {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "delay_minutes", nullable = false)
    private Integer delayMinutes;

    @Column(length = 255)
    private String message;
}
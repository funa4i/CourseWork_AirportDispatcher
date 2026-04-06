package org.desktop.mainservice.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.desktop.mainservice.domain.enums.Status;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "flight_status_history")
public class FlightStatusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private LocalDateTime time;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(length = 255)
    private String comment;
}
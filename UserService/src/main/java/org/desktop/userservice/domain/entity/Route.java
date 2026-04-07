package org.desktop.userservice.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "route")
public class Route {

    public enum FlyType {
        arrival, departure
    }

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;

    @ManyToOne
    @JoinColumn(name = "aircraft_id")
    private Aircraft aircraft;

    @Enumerated(EnumType.STRING)
    @Column(name = "fly_type")
    private FlyType flyType;
}
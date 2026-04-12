package org.desktop.userservice.domain.entity;

import jakarta.persistence.*;
import org.desktop.userservice.domain.enums.FlyType;

@Entity
@Table(name = "route")
public class Route {

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
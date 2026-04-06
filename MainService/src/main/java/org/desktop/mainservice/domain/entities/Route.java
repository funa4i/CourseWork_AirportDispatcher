package org.desktop.mainservice.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.desktop.mainservice.domain.enums.FlyType;

@Data
@Entity
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "airport_id", nullable = false)
    private Airport airport;

    @ManyToOne(optional = false)
    @JoinColumn(name = "aircraft_id", nullable = false)
    private Aircraft aircraft;

    @Enumerated(EnumType.STRING)
    @Column(name = "fly_type", nullable = false)
    private FlyType flyType;
}
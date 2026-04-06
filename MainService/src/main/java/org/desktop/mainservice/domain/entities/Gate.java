package org.desktop.mainservice.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "gate")
public class Gate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gate_name", nullable = false, length = 10, unique = true)
    private String gateName;

    @Column(nullable = false, length = 10)
    private String terminal;
}
package org.desktop.userservice.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gate")
public class Gate {

    @Id
    private Integer id;

    @Column(name = "gate_name", length = 10, nullable = false)
    private String gateName;

    @Column(nullable = false, length = 10)
    private String terminal;
}
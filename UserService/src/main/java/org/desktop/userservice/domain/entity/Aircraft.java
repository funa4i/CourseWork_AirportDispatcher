package org.desktop.userservice.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "aircraft")
public class Aircraft {

    @Id
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Integer capacity;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
package org.desktop.userservice.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {

    @Id
    private Integer id;

    @Column(length = 3, nullable = false)
    private String iata;

    @Column(length = 4, nullable = false)
    private String icao;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String city;
}
package org.desktop.userservice.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

    @Id
    private Integer id;

    @Column(name = "iata_code", length = 3, nullable = false)
    private String iataCode;

    @Column(name = "icao_code", length = 4, nullable = false)
    private String icaoCode;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String country;
}
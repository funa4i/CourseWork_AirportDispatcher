package org.desktop.mainservice.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "iata_code", length = 3, nullable = false, unique = true)
    private String iataCode;

    @Column(name = "icao_code", length = 4, nullable = false, unique = true)
    private String icaoCode;

    @Column(name = "tcld_code", length = 10, unique = true)
    private String tcldCode;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "digital_code", unique = true)
    private Integer digitalCode;

    @Column(nullable = false, length = 100)
    private String country;
}
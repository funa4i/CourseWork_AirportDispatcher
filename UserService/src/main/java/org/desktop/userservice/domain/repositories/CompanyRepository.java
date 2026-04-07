package org.desktop.userservice.domain.repositories;

import org.desktop.userservice.domain.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    Optional<Company> findByIataCode(String iataCode);

    Optional<Company> findByIcaoCode(String icaoCode);
}
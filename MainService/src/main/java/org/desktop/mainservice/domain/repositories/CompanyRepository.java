package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    Optional<Company> findByIataCode(String iataCode);

    Optional<Company> findByIcaoCode(String icaoCode);

    Optional<Company> findByTcldCode(String tcldCode);

    Optional<Company> findByDigitalCode(Integer digitalCode);

    boolean existsByIataCode(String iataCode);

    boolean existsByIcaoCode(String icaoCode);
}
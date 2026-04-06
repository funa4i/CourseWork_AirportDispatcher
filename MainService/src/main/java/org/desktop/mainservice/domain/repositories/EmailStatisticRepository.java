package org.desktop.mainservice.domain.repositories;

import org.desktop.mainservice.domain.entities.EmailStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EmailStatisticRepository extends JpaRepository<EmailStatistic, Integer> {

    Optional<EmailStatistic> findByUserId(Integer userId);

    boolean existsByUserId(Integer userId);
}
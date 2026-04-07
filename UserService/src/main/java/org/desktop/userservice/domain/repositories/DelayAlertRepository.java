package org.desktop.userservice.domain.repositories;

import org.desktop.userservice.domain.entity.DelayAlert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DelayAlertRepository extends JpaRepository<DelayAlert, Integer> {

    List<DelayAlert> findByFlightId(Integer flightId);

    List<DelayAlert> findByDelayMinutesGreaterThan(Integer minutes);
}
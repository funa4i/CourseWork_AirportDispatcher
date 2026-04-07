package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.Flight;
import org.desktop.mainservice.domain.entities.FlightStatusHistory;
import org.desktop.mainservice.domain.enums.Status;
import org.desktop.mainservice.domain.repositories.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;
    private final FlightStatusHistoryService flightStatusHistoryService;
    private final DelayAlertService delayAlertService;

    public Flight create(Flight entity) {
        log.info("create Flight");
        return null;
    }

    public Flight getById(Integer id) {
        log.info("get Flight by id");
        return null;
    }

    public List<Flight> getAll() {
        log.info("get all Flights");
        return null;
    }

    public Flight update(Flight entity) {
        log.info("update Flight");
        return null;
    }

    public void delete(Integer id) {
        log.info("delete Flight");
    }

    public void changeStatus(Integer flightId,
                             Status newStatus,
                             Integer userId,
                             String comment,
                             Integer delayMinutes) {
        log.info("Flight {} status changed from {} to {}", flightId, Status.arrived, newStatus);
//        Flight flight = flightRepository.findById(flightId)
//                .orElseThrow();
//
//        Status oldStatus = flight.getStatus();
//
//        flight.setStatus(newStatus);
//        flightRepository.save(flight);
//
//        FlightStatusHistory history = new FlightStatusHistory();
//        history.setFlight(flight);
//        history.setUser(userId != null ? new User(userId) : null);
//        history.setTime(LocalDateTime.now());
//        history.setStatus(newStatus);
//        history.setComment(comment);
//        historyRepository.save(history);
//
//        // 3. если задержка — создаем alert
//        if (newStatus == Status.delayed && delayMinutes != null) {
//            DelayAlert alert = new DelayAlert();
//            alert.setFlight(flight);
//            alert.setDelayMinutes(delayMinutes);
//            alert.setMessage(comment);
//            alert.setCreatedAt(LocalDateTime.now());
//            delayRepository.save(alert);
//        }
//

    }
}
package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.FlightBinding;
import org.desktop.desktopapplication.domain.dto.view.FlightView;
import org.desktop.desktopapplication.feign.services.FlightService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;

    @FXML
    private TextField idField;

    @FXML
    private TextField numberField;

    @FXML
    private TextField companyIdField;

    @FXML
    private TextField routeIdField;

    @FXML
    private TextField aircraftIdField;

    @FXML
    private TextField gateIdField;

    @FXML
    private DatePicker plannedDateField;

    @FXML
    private TextField plannedTimeField;

    @FXML
    private ComboBox<String> statusField;

    @FXML
    private TableView<FlightView> flightTable;

    @FXML
    public void initialize() {
        loadAll();
    }

    @FXML
    public void createFlight() {
        FlightBinding binding = new FlightBinding();
        binding.setNumber(numberField.getText());
        binding.setCompanyId(Integer.valueOf(companyIdField.getText()));
        binding.setRouteId(Integer.valueOf(routeIdField.getText()));
        binding.setAircraftId(Integer.valueOf(aircraftIdField.getText()));
        binding.setGateId(Integer.valueOf(gateIdField.getText()));
        binding.setPlannedTime(LocalDateTime.parse(plannedDateField.getValue() + "T" + plannedTimeField.getText()));

        log.info("UI action: create flight");
        FlightView created = flightService.create(binding);
        flightTable.getItems().add(created);
    }

    @FXML
    public void getFlightById() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: get flight by id={}", id);
        FlightView flight = flightService.getById(id);
        flightTable.getItems().setAll(flight);
    }

    @FXML
    public void loadAll() {
        log.info("UI action: load all flights");
        List<FlightView> flights = flightService.getAll();
        flightTable.getItems().setAll(flights);
    }

    @FXML
    public void updateFlight() {
        Integer id = Integer.valueOf(idField.getText());

        FlightBinding binding = new FlightBinding();
        binding.setNumber(numberField.getText());
        binding.setCompanyId(Integer.valueOf(companyIdField.getText()));
        binding.setRouteId(Integer.valueOf(routeIdField.getText()));
        binding.setAircraftId(Integer.valueOf(aircraftIdField.getText()));
        binding.setGateId(Integer.valueOf(gateIdField.getText()));
        binding.setPlannedTime(LocalDateTime.parse(plannedDateField.getValue() + "T" + plannedTimeField.getText()));

        log.info("UI action: update flight id={}", id);
        FlightView updated = flightService.update(id, binding);
        loadAll();
        flightTable.getSelectionModel().select(updated);
    }

    @FXML
    public void changeStatus() {
        Integer id = Integer.valueOf(idField.getText());

        ChangeStatusBinding binding = new ChangeStatusBinding();
        binding.setStatus(statusField.getValue());

        log.info("UI action: change flight status id={}", id);
        flightService.changeStatus(id, binding);
        loadAll();
    }

    @FXML
    public void deleteFlight() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: delete flight id={}", id);
        flightService.delete(id);
        loadAll();
    }
}
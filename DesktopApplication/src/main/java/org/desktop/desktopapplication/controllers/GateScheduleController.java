package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.GateScheduleBinding;
import org.desktop.desktopapplication.domain.dto.view.GateScheduleView;
import org.desktop.desktopapplication.feign.services.GateScheduleService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class GateScheduleController {

    private final GateScheduleService gateScheduleService;

    @FXML
    private TextField idField;

    @FXML
    private TextField gateIdField;

    @FXML
    private TextField flightIdField;

    @FXML
    private DatePicker startDateField;

    @FXML
    private TextField startTimeField;

    @FXML
    private DatePicker endDateField;

    @FXML
    private TextField endTimeField;

    @FXML
    private TableView<GateScheduleView> gateScheduleTable;

    @FXML
    public void initialize() {
        loadAll();
    }

    @FXML
    public void createGateSchedule() {
        GateScheduleBinding binding = new GateScheduleBinding();
        binding.setGateId(Integer.valueOf(gateIdField.getText()));
        binding.setFlightId(Integer.valueOf(flightIdField.getText()));
        binding.setStartDate(LocalDateTime.parse(startDateField.getValue() + "T" + startTimeField.getText()));
        binding.setEndDate(LocalDateTime.parse(endDateField.getValue() + "T" + endTimeField.getText()));

        log.info("UI action: create gate schedule");
        GateScheduleView created = gateScheduleService.create(binding);
        gateScheduleTable.getItems().add(created);
    }

    @FXML
    public void getGateScheduleById() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: get gate schedule by id={}", id);
        GateScheduleView schedule = gateScheduleService.getById(id);
        gateScheduleTable.getItems().setAll(schedule);
    }

    @FXML
    public void loadAll() {
        log.info("UI action: load all gate schedules");
        List<GateScheduleView> schedules = gateScheduleService.getAll();
        gateScheduleTable.getItems().setAll(schedules);
    }

    @FXML
    public void updateGateSchedule() {
        Integer id = Integer.valueOf(idField.getText());

        GateScheduleBinding binding = new GateScheduleBinding();
        binding.setGateId(Integer.valueOf(gateIdField.getText()));
        binding.setFlightId(Integer.valueOf(flightIdField.getText()));
        binding.setStartDate(LocalDateTime.parse(startDateField.getValue() + "T" + startTimeField.getText()));
        binding.setEndDate(LocalDateTime.parse(endDateField.getValue() + "T" + endTimeField.getText()));

        log.info("UI action: update gate schedule id={}", id);
        GateScheduleView updated = gateScheduleService.update(id, binding);
        loadAll();
        gateScheduleTable.getSelectionModel().select(updated);
    }

    @FXML
    public void deleteGateSchedule() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: delete gate schedule id={}", id);
        gateScheduleService.delete(id);
        loadAll();
    }
}
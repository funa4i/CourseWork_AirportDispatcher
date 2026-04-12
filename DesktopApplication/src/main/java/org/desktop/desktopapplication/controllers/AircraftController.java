package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.AircraftBinding;
import org.desktop.desktopapplication.domain.dto.view.AircraftView;
import org.desktop.desktopapplication.feign.services.AircraftService;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class AircraftController {

    private final AircraftService aircraftService;

    @FXML
    private TextField modelField;

    @FXML
    private TextField codeField;

    @FXML
    private TextField idField;

    @FXML
    private TableView<AircraftView> aircraftTable;

    @FXML
    public void initialize() {
        loadAll();
    }

    @FXML
    public void createAircraft() {
        AircraftBinding binding = new AircraftBinding();
        binding.setAircraftType(modelField.getText());
        binding.setName(codeField.getText());

        log.info("UI action: create aircraft");
        AircraftView created = aircraftService.create(binding);
        aircraftTable.getItems().add(created);
    }

    @FXML
    public void getAircraftById() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: get aircraft by id={}", id);
        AircraftView aircraft = aircraftService.getById(id);
        aircraftTable.getItems().setAll(aircraft);
    }

    @FXML
    public void loadAll() {
        log.info("UI action: load all aircraft");
        List<AircraftView> aircraft = aircraftService.getAll();
        aircraftTable.getItems().setAll(aircraft);
    }
}
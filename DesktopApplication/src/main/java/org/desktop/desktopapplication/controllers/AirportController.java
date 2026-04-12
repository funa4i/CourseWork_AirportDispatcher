package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.AirportBinding;
import org.desktop.desktopapplication.domain.dto.view.AirportView;
import org.desktop.desktopapplication.feign.services.AirportService;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class AirportController {

    private final AirportService airportService;

    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField iataCodeField;

    @FXML
    private TextField cityField;

    @FXML
    private TextField countryField;

    @FXML
    private TableView<AirportView> airportTable;

    @FXML
    public void initialize() {
        loadAll();
    }

    @FXML
    public void createAirport() {
        AirportBinding binding = new AirportBinding();
        binding.setName(nameField.getText());
        binding.setIata(iataCodeField.getText());
        binding.setCity(cityField.getText());
        binding.setCity(countryField.getText());

        log.info("UI action: create airport");
        AirportView created = airportService.create(binding);
        airportTable.getItems().add(created);
    }

    @FXML
    public void getAirportById() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: get airport by id={}", id);
        AirportView airport = airportService.getById(id);
        airportTable.getItems().setAll(airport);
    }

    @FXML
    public void loadAll() {
        log.info("UI action: load all airports");
        List<AirportView> airports = airportService.getAll();
        airportTable.getItems().setAll(airports);
    }
}
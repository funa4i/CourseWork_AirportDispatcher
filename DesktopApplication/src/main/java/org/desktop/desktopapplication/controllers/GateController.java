package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.GateBinding;
import org.desktop.desktopapplication.domain.dto.view.GateView;
import org.desktop.desktopapplication.feign.services.GateService;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class GateController {

    private final GateService gateService;

    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField terminalField;

    @FXML
    private TableView<GateView> gateTable;

    @FXML
    public void initialize() {
        loadAll();
    }

    @FXML
    public void createGate() {
        GateBinding binding = new GateBinding();
        binding.setGateName(nameField.getText());
        binding.setTerminal(terminalField.getText());

        log.info("UI action: create gate");
        GateView created = gateService.create(binding);
        gateTable.getItems().add(created);
    }

    @FXML
    public void getGateById() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: get gate by id={}", id);
        GateView gate = gateService.getById(id);
        gateTable.getItems().setAll(gate);
    }

    @FXML
    public void loadAll() {
        log.info("UI action: load all gates");
        List<GateView> gates = gateService.getAll();
        gateTable.getItems().setAll(gates);
    }
}
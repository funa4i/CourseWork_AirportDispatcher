package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.RouteBinding;
import org.desktop.desktopapplication.domain.dto.view.RouteView;
import org.desktop.desktopapplication.feign.services.RouteService;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class RouteController {

    private final RouteService routeService;

    @FXML
    private TextField idField;

    @FXML
    private TextField airportFromIdField;

    @FXML
    private TextField airportToIdField;

    @FXML
    private TableView<RouteView> routeTable;

    @FXML
    public void initialize() {
        loadAll();
    }

    @FXML
    public void createRoute() {
        RouteBinding binding = new RouteBinding();
        binding.setAirportId(Integer.valueOf(airportFromIdField.getText()));
        binding.setAircraftId(Integer.valueOf(airportToIdField.getText()));

        log.info("UI action: create route");
        RouteView created = routeService.create(binding);
        routeTable.getItems().add(created);
    }

    @FXML
    public void getRouteById() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: get route by id={}", id);
        RouteView route = routeService.getById(id);
        routeTable.getItems().setAll(route);
    }

    @FXML
    public void loadAll() {
        log.info("UI action: load all routes");
        List<RouteView> routes = routeService.getAll();
        routeTable.getItems().setAll(routes);
    }
}
package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.CompanyBinding;
import org.desktop.desktopapplication.domain.dto.view.CompanyView;
import org.desktop.desktopapplication.feign.services.CompanyService;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField codeField;

    @FXML
    private TableView<CompanyView> companyTable;

    @FXML
    public void initialize() {
        loadAll();
    }

    @FXML
    public void createCompany() {
        CompanyBinding binding = new CompanyBinding();
        binding.setName(nameField.getText());
        binding.setIataCode(codeField.getText());

        log.info("UI action: create company");
        CompanyView created = companyService.create(binding);
        companyTable.getItems().add(created);
    }

    @FXML
    public void getCompanyById() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: get company by id={}", id);
        CompanyView company = companyService.getById(id);
        companyTable.getItems().setAll(company);
    }

    @FXML
    public void loadAll() {
        log.info("UI action: load all companies");
        List<CompanyView> companies = companyService.getAll();
        companyTable.getItems().setAll(companies);
    }
}
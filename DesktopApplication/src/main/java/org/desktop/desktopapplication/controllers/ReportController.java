package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.feign.services.ReportService;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @FXML
    private TextField jwtTokenField;

    @FXML
    public void confirmReport() {
        String jwtToken = jwtTokenField.getText();
        log.info("UI action: confirm report");
        reportService.confirmReport(jwtToken);
    }
}
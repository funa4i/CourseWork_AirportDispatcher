package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.feign.services.EmailStatisticService;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailStatisticController {

    private final EmailStatisticService emailStatisticService;

    @FXML
    private TextField userIdField;

    @FXML
    public void emailScheduleCountIncrease() {
        Integer id = Integer.valueOf(userIdField.getText());
        log.info("UI action: increase email statistic for user id={}", id);
        emailStatisticService.emailScheduleCountIncrease(id);
    }
}
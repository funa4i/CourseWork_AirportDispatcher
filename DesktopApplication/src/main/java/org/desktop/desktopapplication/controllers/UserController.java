package org.desktop.desktopapplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.UserBinding;
import org.desktop.desktopapplication.domain.dto.view.UserView;
import org.desktop.desktopapplication.feign.services.UserService;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @FXML
    private TextField idField;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField roleField;

    @FXML
    private TableView<UserView> userTable;

    @FXML
    public void createUser() {
        UserBinding binding = new UserBinding();
        binding.setUsername(loginField.getText());
        binding.setPassword(passwordField.getText());
        binding.setRole(roleField.getText());

        log.info("UI action: create user");
        UserView created = userService.create(binding);
        userTable.getItems().add(created);
    }

    @FXML
    public void getCurrentUser() {
        log.info("UI action: get current user");
        UserView user = userService.get();
        userTable.getItems().setAll(user);
    }

    @FXML
    public void getUserById() {
        Integer id = Integer.valueOf(idField.getText());
        log.info("UI action: get user by id={}", id);
        UserView user = userService.getById(id);
        userTable.getItems().setAll(user);
    }

    @FXML
    public void login() {
        log.info("UI action: login");
        userService.login();
    }
}
package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.domain.dto.binding.UserBinding;
import org.desktop.desktopapplication.domain.dto.view.UserView;
import org.desktop.desktopapplication.feign.interfaces.UserFeignClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserFeignClient userFeignClient;

    public UserView create(UserBinding binding) {
        log.info("Creating user: {}", binding);
        UserView response = userFeignClient.create(binding);
        log.info("User created: {}", response);
        return response;
    }

    public UserView get() {
        log.info("Getting current user");
        UserView response = userFeignClient.get();
        log.info("Current user received: {}", response);
        return response;
    }

    public UserView getById(Integer id) {
        log.info("Getting user by id: {}", id);
        UserView response = userFeignClient.getById(id);
        log.info("User received: {}", response);
        return response;
    }

    public void login() {
        log.info("Calling login endpoint");
        userFeignClient.login();
        log.info("Login endpoint called");
    }
}
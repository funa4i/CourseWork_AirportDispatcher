package org.desktop.desktopapplication.feign.interfaces;

import org.desktop.desktopapplication.domain.dto.binding.UserBinding;
import org.desktop.desktopapplication.domain.dto.view.UserView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "userClient", url = "${api.base-url}")
public interface UserFeignClient {

    @PostMapping("/api/users")
    UserView create(@RequestBody UserBinding binding);

    @GetMapping("/api/users")
    UserView get();

    @GetMapping("/api/users/{id}")
    UserView getById(@PathVariable("id") Integer id);

    @GetMapping("/api/users/auth/login")
    void login();
}
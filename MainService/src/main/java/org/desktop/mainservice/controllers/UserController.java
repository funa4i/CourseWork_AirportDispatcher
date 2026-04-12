package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.UserBinding;
import org.desktop.mainservice.domain.dto.view.UserView;
import org.desktop.mainservice.domain.entities.User;
import org.desktop.mainservice.domain.repositories.UserRepository;
import org.desktop.mainservice.service.UserService;
import org.desktop.mainservice.util.mapper.UserMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;
    private final UserMapper mapper;

    @PostMapping
    public UserView create(@RequestBody @Valid UserBinding binding) {
        User entity = mapper.toEntity(binding);
        return mapper.toView(service.create(entity));
    }

    @GetMapping
    public UserView get(){
        return mapper.toView(
                service.getById(Integer
                        .parseInt(SecurityContextHolder
                                .getContext()
                                .getAuthentication()
                                .getName())));
    }

    @GetMapping("/{id}")
    public UserView getById(@PathVariable Integer id) {
        return mapper.toView(service.getById(id));
    }

    @GetMapping("/auth/login")
    public void login() {
    }
}
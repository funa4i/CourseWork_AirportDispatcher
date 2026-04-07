package org.desktop.mainservice.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.dto.binding.UserBinding;
import org.desktop.mainservice.domain.dto.view.UserView;
import org.desktop.mainservice.domain.repositories.UserRepository;
import org.desktop.mainservice.util.mapper.UserMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repository;
    private final UserMapper mapper;

    @PostMapping
    public UserView create(@RequestBody @Valid UserBinding binding) {
        User entity = mapper.toEntity(binding);
        return mapper.toView(repository.save(entity));
    }

    @GetMapping("/{id}")
    public UserView getById(@PathVariable Integer id) {
        return repository.findById(id)
                .map(mapper::toView)
                .orElse(null);
    }

    @GetMapping("/auth/login")
    public void login() {
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
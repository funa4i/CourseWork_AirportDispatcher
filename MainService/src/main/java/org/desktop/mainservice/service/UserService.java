package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.User;
import org.desktop.mainservice.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserService {
    private JwtServ jwtServ;
    private final UserRepository userRepository;

    public User create(User entity) {
        log.info("create User");
        return null;
    }

    public User getById(Integer id) {
        log.info("get User by id");
        return null;
    }

    public List<User> getAll() {
        log.info("get all Users");
        return null;
    }
}
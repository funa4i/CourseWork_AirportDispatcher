package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.domain.entities.User;
import org.desktop.mainservice.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticateService {

    private final JwtServ jwtServ;
    private final UserRepository userRepository;

    public void create(User user) {
    }

    public void login(User user) {
    }
}

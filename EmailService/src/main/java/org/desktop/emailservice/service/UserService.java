package org.desktop.emailservice.service;

import lombok.RequiredArgsConstructor;
import org.desktop.emailservice.feign.UserFeign;
import org.desktop.emailservice.feign.dto.UserView;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserFeign userFeign;

    public UserView getUser() {
        return userFeign.getProfile();
    }
}

package org.desktop.emailservice.feign;

import org.desktop.emailservice.feign.dto.UserView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient
public interface UserFeign {

    @GetMapping
    UserView getProfile();
}

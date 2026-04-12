package org.desktop.desktopapplication.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "reportClient", url = "${email.api.base-url}")
public interface ReportFeignClient {

    @GetMapping("/")
    void confirmReport(@RequestHeader("Authentication") String jwt_token);
}
package org.desktop.desktopapplication.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "emailStatisticClient", url = "${api.base-url}")
public interface EmailStatisticFeignClient {

    @PostMapping("/api/email-statistics/POST /users/{id}/schedule-sent")
    void emailScheduleCountIncrease(@PathVariable("id") Integer id);
}
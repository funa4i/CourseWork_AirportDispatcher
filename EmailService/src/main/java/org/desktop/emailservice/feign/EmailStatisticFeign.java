package org.desktop.emailservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "${schedule.url}")
public interface EmailStatisticFeign {
    @PostMapping(value = "POST /users/{id}/schedule-sent")
    void emailScheduleCountIncrease(@PathVariable Integer id, @RequestHeader("Authorization") String token);
}

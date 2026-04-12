package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.feign.interfaces.EmailStatisticFeignClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailStatisticService {

    private final EmailStatisticFeignClient emailStatisticFeignClient;

    public void emailScheduleCountIncrease(Integer id) {
        log.info("Increasing email schedule statistics for user id: {}", id);
        emailStatisticFeignClient.emailScheduleCountIncrease(id);
        log.info("Email schedule statistics increased for user id: {}", id);
    }
}
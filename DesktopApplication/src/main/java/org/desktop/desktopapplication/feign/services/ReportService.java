package org.desktop.desktopapplication.feign.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.desktop.desktopapplication.feign.interfaces.ReportFeignClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportFeignClient reportFeignClient;

    public void confirmReport(String jwtToken) {
        log.info("Calling confirm report endpoint");
        reportFeignClient.confirmReport(jwtToken);
        log.info("Confirm report endpoint called");
    }
}
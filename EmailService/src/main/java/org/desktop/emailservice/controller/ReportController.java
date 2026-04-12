package org.desktop.emailservice.controller;

import lombok.RequiredArgsConstructor;
import org.desktop.emailservice.service.EmailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReportController {
    private final EmailService emailService;

    @GetMapping
    public void confirmReport(@RequestHeader("Authentication") String jwt_token) {

    }
}

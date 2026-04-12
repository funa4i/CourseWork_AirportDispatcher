package org.desktop.mainservice.controllers;

import lombok.RequiredArgsConstructor;
import org.desktop.mainservice.service.EmailStatisticService;
import org.desktop.mainservice.util.mapper.EmailStatisticMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email-statistics")
@RequiredArgsConstructor
public class EmailStatisticController {

    private final EmailStatisticService service;
    private final EmailStatisticMapper mapper;

    @PostMapping("POST /users/{id}/schedule-sent")
    public void emailScheduleCountIncrease(@PathVariable Integer id){

    }
}
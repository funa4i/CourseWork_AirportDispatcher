package org.desktop.mainservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.desktop.mainservice.domain.entities.EmailStatistic;
import org.desktop.mainservice.domain.repositories.EmailStatisticRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class EmailStatisticService {

    private final EmailStatisticRepository repository;
    private final UserService userService;

    public void increaseScheduleEmailCount(Integer UserId) {

    }
}
package org.desktop.emailservice.service;

import lombok.RequiredArgsConstructor;
import org.desktop.emailservice.feign.EmailStatisticFeign;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailStatisticService {
    private final EmailStatisticFeign emailStatisticFeign;

    private void increaseStatistic(){
    }
}

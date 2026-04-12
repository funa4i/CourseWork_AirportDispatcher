package org.desktop.emailservice.feign;

import org.desktop.emailservice.feign.dto.FlightView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(url = "${flight.url}")
public interface FlightFeign {

    @GetMapping
    public List<FlightView> getAll(@RequestHeader("Authorization") String token);
}

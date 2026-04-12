package org.desktop.desktopapplication.feign.interfaces;

import org.desktop.desktopapplication.domain.dto.binding.CompanyBinding;
import org.desktop.desktopapplication.domain.dto.view.CompanyView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "companyClient", url = "${api.base-url}")
public interface CompanyFeignClient {

    @PostMapping("/api/companies")
    CompanyView create(@RequestBody CompanyBinding binding);

    @GetMapping("/api/companies/{id}")
    CompanyView getById(@PathVariable("id") Integer id);

    @GetMapping("/api/companies")
    List<CompanyView> getAll();
}
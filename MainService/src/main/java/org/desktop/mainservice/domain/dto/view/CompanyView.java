package org.desktop.mainservice.domain.dto.view;

import lombok.Data;

@Data
public class CompanyView {

    private Integer id;
    private String iataCode;
    private String icaoCode;
    private String tcldCode;
    private String name;
    private Integer digitalCode;
    private String country;
}
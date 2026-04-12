package org.desktop.userservice.domain.dto.request;

import lombok.Data;

@Data
public abstract class BasePageRequest {
    private Integer page = 0;
    private Integer size = 20;
    private String sortBy = "id";
    private String sortDirection = "asc";
}

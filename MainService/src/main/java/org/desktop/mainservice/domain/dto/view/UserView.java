package org.desktop.mainservice.domain.dto.view;

import lombok.Data;

@Data
public class UserView {

    private Integer id;
    private String username;
    private String role;
}
package org.desktop.emailservice.feign.dto;

import lombok.Data;

@Data
public class UserView {

    private Integer id;
    private String username;
    private String role;
    private String email;
}
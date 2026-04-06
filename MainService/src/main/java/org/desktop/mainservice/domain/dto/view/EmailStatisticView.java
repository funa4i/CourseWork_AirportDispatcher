package org.desktop.mainservice.domain.dto.view;

import lombok.Data;

@Data
public class EmailStatisticView {

    private Integer id;
    private Integer userId;
    private Integer messageCount;
}
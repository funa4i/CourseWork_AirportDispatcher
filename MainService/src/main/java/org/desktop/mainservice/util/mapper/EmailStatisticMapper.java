package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.view.EmailStatisticView;
import org.desktop.mainservice.domain.entities.EmailStatistic;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmailStatisticMapper {

    @Mapping(source = "user.id", target = "userId")
    EmailStatisticView toView(EmailStatistic entity);

    List<EmailStatisticView> toViewList(List<EmailStatistic> entities);
}
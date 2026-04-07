package org.desktop.userservice.utils.mappers;

import org.desktop.userservice.domain.dto.views.DelayAlertView;
import org.desktop.userservice.domain.entity.DelayAlert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DelayAlertMapper {

    @Mapping(source = "flight.id", target = "flightId")
    DelayAlertView toView(DelayAlert entity);

    List<DelayAlertView> toViewList(List<DelayAlert> entities);

}
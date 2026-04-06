package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.DelayAlertBinding;
import org.desktop.mainservice.domain.dto.view.DelayAlertView;
import org.desktop.mainservice.domain.entities.DelayAlert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DelayAlertMapper {

    @Mapping(source = "flight.id", target = "flightId")
    DelayAlertView toView(DelayAlert entity);

    List<DelayAlertView> toViewList(List<DelayAlert> entities);

    @Mapping(source = "flightId", target = "flight.id")
    DelayAlert toEntity(DelayAlertBinding binding);
}
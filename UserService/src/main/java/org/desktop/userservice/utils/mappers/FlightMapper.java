package org.desktop.userservice.utils.mappers;

import org.desktop.userservice.domain.dto.views.FlightView;
import org.desktop.userservice.domain.entity.Flight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FlightMapper {

    @Mapping(source = "route.id", target = "routeId")
    FlightView toView(Flight entity);

    List<FlightView> toViewList(List<Flight> entities);

}
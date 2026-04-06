package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.FlightBinding;
import org.desktop.mainservice.domain.dto.view.FlightView;
import org.desktop.mainservice.domain.entities.Flight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FlightMapper {

    @Mapping(source = "route.id", target = "routeId")
    FlightView toView(Flight entity);

    List<FlightView> toViewList(List<Flight> entities);

    @Mapping(source = "routeId", target = "route.id")
    Flight toEntity(FlightBinding binding);
}
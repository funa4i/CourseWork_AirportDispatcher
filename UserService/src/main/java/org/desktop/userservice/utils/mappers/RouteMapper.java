package org.desktop.userservice.utils.mappers;

import org.desktop.userservice.domain.dto.views.RouteView;
import org.desktop.userservice.domain.entity.Route;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RouteMapper {

    @Mapping(source = "airport.id", target = "airportId")
    @Mapping(source = "aircraft.id", target = "aircraftId")
    @Mapping(source = "flyType", target = "flyType")
    RouteView toView(Route entity);

    List<RouteView> toViewList(List<Route> entities);
}
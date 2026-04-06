package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.RouteBinding;
import org.desktop.mainservice.domain.dto.view.RouteView;
import org.desktop.mainservice.domain.entities.Route;
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

    @Mapping(source = "airportId", target = "airport.id")
    @Mapping(source = "aircraftId", target = "aircraft.id")
    @Mapping(source = "flyType", target = "flyType")
    Route toEntity(RouteBinding binding);
}
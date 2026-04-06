package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.AirportBinding;
import org.desktop.mainservice.domain.dto.view.AirportView;
import org.desktop.mainservice.domain.entities.Airport;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AirportMapper {

    AirportView toView(Airport entity);

    List<AirportView> toViewList(List<Airport> entities);

    Airport toEntity(AirportBinding binding);
}
package org.desktop.userservice.utils.mappers;

import org.desktop.userservice.domain.dto.views.AirportView;
import org.desktop.userservice.domain.entity.Airport;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AirportMapper {

    AirportView toView(Airport entity);

    List<AirportView> toViewList(List<Airport> entities);

}
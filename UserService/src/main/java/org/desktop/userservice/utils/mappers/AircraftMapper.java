package org.desktop.userservice.utils.mappers;


import org.desktop.userservice.domain.dto.views.AircraftView;
import org.desktop.userservice.domain.entity.Aircraft;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AircraftMapper {

    @Mapping(source = "company.id", target = "companyId")
    AircraftView toView(Aircraft entity);

    List<AircraftView> toViewList(List<Aircraft> entities);
}
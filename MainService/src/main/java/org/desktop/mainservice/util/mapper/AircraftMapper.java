package org.desktop.mainservice.util.mapper;


import org.desktop.mainservice.domain.dto.binding.AircraftBinding;
import org.desktop.mainservice.domain.dto.view.AircraftView;
import org.desktop.mainservice.domain.entities.Aircraft;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AircraftMapper {

    @Mapping(source = "company.id", target = "companyId")
    AircraftView toView(Aircraft entity);

    List<AircraftView> toViewList(List<Aircraft> entities);

    @Mapping(source = "companyId", target = "company.id")
    Aircraft toEntity(AircraftBinding binding);
}
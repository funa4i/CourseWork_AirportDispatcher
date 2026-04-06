package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.GateScheduleBinding;
import org.desktop.mainservice.domain.dto.view.GateScheduleView;
import org.desktop.mainservice.domain.entities.GateSchedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GateScheduleMapper {

    @Mapping(source = "gate.id", target = "gateId")
    @Mapping(source = "flight.id", target = "flightId")
    GateScheduleView toView(GateSchedule entity);

    List<GateScheduleView> toViewList(List<GateSchedule> entities);

    @Mapping(source = "gateId", target = "gate.id")
    @Mapping(source = "flightId", target = "flight.id")
    GateSchedule toEntity(GateScheduleBinding binding);
}
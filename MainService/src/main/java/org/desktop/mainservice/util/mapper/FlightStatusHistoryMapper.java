package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.FlightStatusHistoryBinding;
import org.desktop.mainservice.domain.dto.view.FlightStatusHistoryView;
import org.desktop.mainservice.domain.entities.FlightStatusHistory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FlightStatusHistoryMapper {

    @Mapping(source = "flight.id", target = "flightId")
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "status", target = "status")
    FlightStatusHistoryView toView(FlightStatusHistory entity);

    List<FlightStatusHistoryView> toViewList(List<FlightStatusHistory> entities);

    @Mapping(source = "flightId", target = "flight.id")
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "status", target = "status")
    FlightStatusHistory toEntity(FlightStatusHistoryBinding binding);
}
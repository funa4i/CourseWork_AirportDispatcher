package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.GateBinding;
import org.desktop.mainservice.domain.dto.view.GateView;
import org.desktop.mainservice.domain.entities.Gate;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GateMapper {

    GateView toView(Gate entity);

    List<GateView> toViewList(List<Gate> entities);

    Gate toEntity(GateBinding binding);
}
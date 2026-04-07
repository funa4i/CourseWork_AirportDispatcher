package org.desktop.userservice.utils.mappers;

import org.desktop.userservice.domain.dto.views.GateView;
import org.desktop.userservice.domain.entity.Gate;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GateMapper {

    GateView toView(Gate entity);

    List<GateView> toViewList(List<Gate> entities);

}
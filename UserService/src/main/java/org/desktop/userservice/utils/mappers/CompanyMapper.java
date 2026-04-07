package org.desktop.userservice.utils.mappers;

import org.desktop.userservice.domain.dto.views.CompanyView;
import org.desktop.userservice.domain.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper {

    CompanyView toView(Company entity);

    List<CompanyView> toViewList(List<Company> entities);
}
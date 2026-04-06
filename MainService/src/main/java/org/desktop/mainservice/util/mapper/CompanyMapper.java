package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.CompanyBinding;
import org.desktop.mainservice.domain.dto.view.CompanyView;
import org.desktop.mainservice.domain.entities.Company;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper {

    CompanyView toView(Company entity);

    List<CompanyView> toViewList(List<Company> entities);

    Company toEntity(CompanyBinding binding);
}
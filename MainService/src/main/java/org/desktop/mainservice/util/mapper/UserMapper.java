package org.desktop.mainservice.util.mapper;

import org.desktop.mainservice.domain.dto.binding.UserBinding;
import org.desktop.mainservice.domain.dto.view.UserView;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.desktop.mainservice.domain.entities.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "role", target = "role")
    UserView toView(User entity);

    List<UserView> toViewList(List<User> entities);

    @Mapping(source = "role", target = "role")
    User toEntity(UserBinding binding);
}
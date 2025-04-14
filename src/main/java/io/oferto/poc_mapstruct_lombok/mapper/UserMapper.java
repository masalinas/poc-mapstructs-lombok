package io.oferto.poc_mapstruct_lombok.mapper;

import org.mapstruct.Mapper;

import io.oferto.poc_mapstruct_lombok.domain.User;
import io.oferto.poc_mapstruct_lombok.dto.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);
}

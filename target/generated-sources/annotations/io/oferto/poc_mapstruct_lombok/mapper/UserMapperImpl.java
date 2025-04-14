package io.oferto.poc_mapstruct_lombok.mapper;

import io.oferto.poc_mapstruct_lombok.domain.User;
import io.oferto.poc_mapstruct_lombok.dto.UserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-14T19:17:16+0200",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.active( user.isActive() );
        userDTO.id( user.getId() );
        userDTO.name( user.getName() );
        userDTO.username( user.getUsername() );

        return userDTO.build();
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.active( userDTO.isActive() );
        user.id( userDTO.getId() );
        user.name( userDTO.getName() );
        user.username( userDTO.getUsername() );

        return user.build();
    }
}

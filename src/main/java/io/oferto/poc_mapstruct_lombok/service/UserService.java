package io.oferto.poc_mapstruct_lombok.service;

import org.springframework.stereotype.Service;

import io.oferto.poc_mapstruct_lombok.domain.User;
import io.oferto.poc_mapstruct_lombok.dto.UserDTO;
import io.oferto.poc_mapstruct_lombok.mapper.UserMapper;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper mapper) {
        this.userMapper = mapper;
    }

    public UserDTO getUser(Long id) {
        User user = User.builder().id(0).name("Sample Actor").username("admin").password("password").build();

        return userMapper.toDTO(user);
    }
}

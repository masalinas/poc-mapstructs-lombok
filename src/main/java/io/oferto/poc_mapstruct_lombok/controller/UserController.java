package io.oferto.poc_mapstruct_lombok.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.oferto.poc_mapstruct_lombok.dto.UserDTO;
import io.oferto.poc_mapstruct_lombok.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUsers(@PathVariable long userId) {
        log.debug("get all users");

        UserDTO result = userService.getUser(userId);

        return new ResponseEntity<UserDTO>(result, HttpStatus.OK);
    }
}
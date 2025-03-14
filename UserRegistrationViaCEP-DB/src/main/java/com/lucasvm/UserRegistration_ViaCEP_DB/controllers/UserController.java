package com.lucasvm.UserRegistration_ViaCEP_DB.controllers;

import com.lucasvm.UserRegistration_ViaCEP_DB.dtos.UserDto;
import com.lucasvm.UserRegistration_ViaCEP_DB.models.UserModel;
import com.lucasvm.UserRegistration_ViaCEP_DB.repositories.UserRepository;
import com.lucasvm.UserRegistration_ViaCEP_DB.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Mono<ResponseEntity<Object>> addUser(@RequestBody @Valid UserDto UserDto) {
        return userService.registerUser(UserDto)
                .map(user -> ResponseEntity.status(HttpStatus.CREATED).body(user));
    }


}

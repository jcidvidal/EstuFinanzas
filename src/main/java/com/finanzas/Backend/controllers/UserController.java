package com.finanzas.Backend.controllers;

import com.finanzas.Backend.dtos.UserRequest;
import com.finanzas.Backend.models.User;
import com.finanzas.Backend.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {


    private final UserService userService;

  public UserController(UserService userService) {
      this.userService = userService;
  }

    // GET /users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // GET /users/{id}
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST /users
    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserRequest userRequest) {
        User user = new User(
                null,
                userRequest.getName(),
                userRequest.getLastName(),
                userRequest.getRuth(),
                userRequest.getEmail(),
                userRequest.getPassword(),
                userRequest.getRole()
        );
        return ResponseEntity.ok(userService.createUser(user));
    }

    // DELETE /users/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserbyId(@PathVariable String id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}

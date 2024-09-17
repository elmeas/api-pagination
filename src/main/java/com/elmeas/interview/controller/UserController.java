package com.elmeas.interview.controller;

import com.elmeas.interview.model.UserDTO;
import com.elmeas.interview.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/hello")
  public List<UserDTO> getAllUsers() {
    return userService.getAllUsers();
  }
}

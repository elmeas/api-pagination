package com.elmeas.interview.service;


import com.elmeas.interview.model.UserDTO;
import com.elmeas.interview.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAllUsers();
    }
}

package com.company.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Level;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(Long id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent() && user.get().isDisabled()) {
            java.util.logging.Logger.getLogger("myLogger").log(Level.INFO, "Log: User is disabled");
            throw new Exception("User is disabled");
        }

        return user;
    }

}

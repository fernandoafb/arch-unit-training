package com.company.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserService {

    private static final Logger log = Logger.getLogger("Wrong Logger");

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(Long id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent() && user.get().isDisabled()) {
            log.log(Level.INFO, "Log: User is disabled");
            throw new Exception("User is disabled");
        }

        return user;
    }

}

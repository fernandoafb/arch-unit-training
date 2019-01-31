package com.company.api;

import com.company.api.impl.ServiceLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private ServiceLogger serviceLogger;

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(Long id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent() && user.get().isDisabled()) {
            serviceLogger.info("Log: User is disabled");
            throw new Exception("User is disabled");
        }

        return user;
    }

}

package com.company.api.impl;

import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class NewServiceLogger implements LoggingInterface {

    private static final Logger log = Logger.getLogger("Wrong Logger");

    public void info(String message) {
        log.log(Level.INFO, "New service logger: " + message);
    }

}

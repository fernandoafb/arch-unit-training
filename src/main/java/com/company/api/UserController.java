package com.company.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable Long id) throws Exception {
        Optional<User> user = userService.getUser(id);
        if (user.isPresent()) {
            System.out.println("User found");
            UserResponse userResponse = new UserResponse(user.get());
            return ResponseEntity.ok(userResponse);
        } else {
            System.out.println("User not found");
            return ResponseEntity.notFound().build();
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleError() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

}

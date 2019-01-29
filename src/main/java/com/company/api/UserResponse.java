package com.company.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private Long id;
    private String username;

    public UserResponse(User user) {
        this.id = user.getId();
        this.username = user.getLogin();
    }

}

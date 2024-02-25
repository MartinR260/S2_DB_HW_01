package com.example.tuesdb.dtos;

import com.example.tuesdb.models.User;

public class UserDto {

    private Long userId;
    private String username;

    public UserDto(User a) {

        this.userId = a.getUserId();
        this.username = a.getUsername();
    }

    public Long getUserId() { return userId; }

    public void setUserId(Long userId) { this.userId = userId; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }
}

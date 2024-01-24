package com.example.JwtAuthonification.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginDTO {
    private String username;
    private String password;
}

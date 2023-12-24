package com.jwt.example.SpringJwt.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class JwtRequest {

    private String email;
    private String password;
}

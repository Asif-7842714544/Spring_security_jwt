package com.jwt.example.SpringJwt.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class JwtResponse {

    private String jwtToken;
    private String username;

}

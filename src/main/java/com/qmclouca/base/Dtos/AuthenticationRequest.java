package com.qmclouca.base.Dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class AuthenticationRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;

    // Default constructor for JSON Parsing
    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

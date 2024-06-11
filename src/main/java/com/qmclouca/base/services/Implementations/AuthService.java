package com.qmclouca.base.services.Implementations;

import com.qmclouca.base.Dtos.AuthenticationRequest;
import com.qmclouca.base.Dtos.AuthenticationResponse;
import com.qmclouca.base.utils.Auth.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private ClientDetailsService clientDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public AuthenticationResponse authenticate(AuthenticationRequest authRequest) throws Exception {

        UserDetails userDetails = clientDetailsService.loadUserByUsername(authRequest.getUsername());

        if (!passwordEncoder.matches(authRequest.getPassword(), userDetails.getPassword())) {
            throw new Exception("Invalid username or password");
        }

        String token = jwtTokenUtil.generateToken(userDetails);
        return new AuthenticationResponse(token);
    }
}

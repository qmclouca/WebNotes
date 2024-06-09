package com.qmclouca.base.utils.JwtGenerator;
import com.qmclouca.base.models.Client;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Map;

public interface JwtTokenProvider {
    Map<String, String> generateToken(Client client);
    boolean validateToken(String token);
    UserDetails getUserDetails(String jwt);
    String resolveToken(jakarta.servlet.http.HttpServletRequest req);
    Authentication getAuthentication(String token);
}

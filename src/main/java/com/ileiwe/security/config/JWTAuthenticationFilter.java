package com.ileiwe.security.config;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JWTAuthentificationFilter extends UsernamePasswordAuthenticationFilter {
    private AuthenticationManager authManager;

    @Override
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        super.setAuthenticationManager(authenticationManager);
    }
}

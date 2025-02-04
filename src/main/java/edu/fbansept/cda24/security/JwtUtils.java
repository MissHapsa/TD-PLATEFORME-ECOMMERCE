package edu.fbansept.cda24.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtUtils {

    public String generateToken(UserDetails userDetails) {

        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "azerty")
                .setSubject(userDetails.getUsername())
                .compact();

    }

}

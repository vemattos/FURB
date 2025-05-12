package com.web2.trabalhorest.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.web2.trabalhorest.models.AppUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

	@Value("${security.jwt.secret-key}")
	private String secretKey;
	
	@Value("${security.jwt.expiration-time-ms}")
	private long expirationTimeMs;
	
	@Value("${security.jwt.issuer}")
	private String issuer;
	
	
	public String createJwtToken(AppUser user) {
		byte[] keyBytes = Decoders.BASE64.decode(secretKey);
		var key = Keys.hmacShaKeyFor(keyBytes);
		
		return Jwts
				.builder()
				.subject(user.getEmail())
				.issuedAt(new Date(System.currentTimeMillis()))
				.issuer(issuer)
				.expiration(new Date(System.currentTimeMillis() + expirationTimeMs))
				.signWith(key)
				.compact();
	}
	
	
	public Claims getTokenClaims(String token) {
		byte[] keyBytes = Decoders.BASE64.decode(secretKey);
		var key = Keys.hmacShaKeyFor(keyBytes);
		
		try {
			var claims = Jwts
						.parser()
						.verifyWith(key)
						.build()
						.parseSignedClaims(token)
						.getPayload();
			
			Date expDate = claims.getExpiration();
			Date currentDate = new Date();
			if (currentDate.before(expDate)) {
				return claims;
			}
		}
		catch (Exception ex) {
		}
		
		return null;
	}
}

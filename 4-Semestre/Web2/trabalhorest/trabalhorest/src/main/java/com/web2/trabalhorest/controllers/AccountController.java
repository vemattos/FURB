package com.web2.trabalhorest.controllers;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import com.web2.trabalhorest.models.AppUser;
import com.web2.trabalhorest.models.LoginDto;
import com.web2.trabalhorest.models.RegisterDto;
import com.web2.trabalhorest.repositories.AppUserRepository;
import com.web2.trabalhorest.services.JwtService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AppUserRepository appUserRepository;
	
	@Autowired
	private JwtService jwtService;
	
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	@GetMapping("/profile")
	public ResponseEntity<Object> profile (Authentication auth){
		var response = new HashMap<String, Object>();
		response.put("Username", auth.getName());
		response.put("Authorities", auth.getAuthorities());
		
		var appUser = appUserRepository.findByEmail(auth.getName());
		response.put("User", appUser);
		
		return ResponseEntity.ok(response);
	}
	
	
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(
			@Valid @RequestBody RegisterDto registerDto
			, BindingResult result){
		
		
		if (result.hasErrors()) {
			var errorsList = result.getAllErrors();
			var errorsMap = new HashMap<String, String>();
			
			for(int i = 0; i < errorsList.size(); i++) {
				var error = (FieldError) errorsList.get(i);
				errorsMap.put(error.getField(), error.getDefaultMessage());
			}
			
			return ResponseEntity.badRequest().body(errorsMap);
		}
		
		
		AppUser appUser = new AppUser();
		appUser.setFirstName(registerDto.getFirstName());
		appUser.setLastName(registerDto.getLastName());
		appUser.setEmail(registerDto.getEmail());
		appUser.setPhone(registerDto.getPhone());
		appUser.setAddress(registerDto.getAddress());
		appUser.setRole("client");
		appUser.setCreatedAt(new Date());
		
		var bCryptEncoder = new BCryptPasswordEncoder();
		appUser.setPassword(bCryptEncoder.encode(registerDto.getPassword()));
		
		
		try {
			var otherUser = appUserRepository.findByEmail(registerDto.getEmail());
			if (otherUser != null) {
				return ResponseEntity.badRequest().body("Email address already used");
			}
			
			appUserRepository.save(appUser);
			
			String jwtToken = jwtService.createJwtToken(appUser);
			
			var response = new HashMap<String, Object>();
			response.put("token", jwtToken);
			response.put("user", appUser);
			
			return ResponseEntity.ok(response);
		}
		catch (Exception ex) {
			System.out.println("There is an Exception :");
			ex.printStackTrace();
		}
		
		return ResponseEntity.badRequest().body("Error");
	}
	
	
	
	@PostMapping("/login")
	public ResponseEntity<Object> login(
			@Valid @RequestBody LoginDto loginDto
			, BindingResult result) {
		
		
		if (result.hasErrors()) {
			var errorsList = result.getAllErrors();
			var errorsMap = new HashMap<String, String>();
			
			for(int i = 0; i < errorsList.size(); i++) {
				var error = (FieldError) errorsList.get(i);
				errorsMap.put(error.getField(), error.getDefaultMessage());
			}
			
			return ResponseEntity.badRequest().body(errorsMap);
		}
		
		
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							loginDto.getEmail(),
							loginDto.getPassword()
					)
			);
			
			AppUser appUser = appUserRepository.findByEmail(loginDto.getEmail());
			
			String jwtToken = jwtService.createJwtToken(appUser);
			
			var response = new HashMap<String, Object>();
			response.put("token", jwtToken);
			response.put("user", appUser);
			
			return ResponseEntity.ok(response);
		}
		catch (Exception ex) {
			System.out.println("There is an Exception :");
			ex.printStackTrace();
		}
		
		return ResponseEntity.badRequest().body("Bad username or password");
	}
}


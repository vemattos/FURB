package com.web2.trabalhorest.config;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
 
import com.web2.trabalhorest.services.JwtAuthenticationFilter;
 
@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	private JwtAuthenticationFilter filter;

 
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests( auth -> auth
						.requestMatchers("/").permitAll()
						.requestMatchers(HttpMethod.GET, "/autores/**").permitAll()
						.requestMatchers(HttpMethod.GET, "/categorias/**").permitAll()
						.requestMatchers(HttpMethod.GET, "/biblioteca/**").permitAll()
						.requestMatchers("/account").permitAll()
						.requestMatchers("/account/login").permitAll()
						.requestMatchers("/account/register").permitAll()
						.anyRequest().authenticated()
				)
				.csrf(csrf -> csrf.disable())
				.httpBasic(basic -> basic.disable())
				.sessionManagement(session -> session.sessionCreationPolicy(
						SessionCreationPolicy.STATELESS))
				.addFilterBefore(filter, 
						UsernamePasswordAuthenticationFilter.class)
				.build();
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration builder)
			throws Exception {
		return builder.getAuthenticationManager();
	}
}
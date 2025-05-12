package com.web2.trabalhorest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web2.trabalhorest.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

	public AppUser findByEmail(String email);
}

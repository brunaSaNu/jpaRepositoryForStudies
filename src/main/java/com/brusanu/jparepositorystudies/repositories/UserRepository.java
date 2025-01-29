package com.brusanu.jparepositorystudies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusanu.jparepositorystudies.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

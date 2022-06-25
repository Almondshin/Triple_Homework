package com.triple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triple.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

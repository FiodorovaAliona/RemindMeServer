package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.username = :username")
    User findByUsername(String username);

    @Query("select u from User u where u.email = :email")
    User findByEmail (String email);

    @Query("select u from User u where u.registration_date = :registration_date")
    List<User> findByRegistration_date (String registration_date);

}
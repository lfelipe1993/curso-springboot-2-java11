package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//Ja esta registrado como repository por conta de extender o JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

}

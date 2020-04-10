package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

//Ja esta registrado como repository por conta de extender o JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long> {

}

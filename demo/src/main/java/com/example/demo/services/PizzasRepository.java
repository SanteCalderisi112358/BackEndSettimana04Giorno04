package com.example.demo.services;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoEntities.AbPizza;

@Repository
public interface PizzasRepository extends JpaRepository<AbPizza, UUID> {

}

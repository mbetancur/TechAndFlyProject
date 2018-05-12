package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Serializable> {

}

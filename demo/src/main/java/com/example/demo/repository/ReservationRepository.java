package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Serializable> {

	List<Reservation> findBycedulaCliente(int cedula);
}

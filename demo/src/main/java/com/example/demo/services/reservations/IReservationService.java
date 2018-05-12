package com.example.demo.services.reservations;

import java.util.List;

import com.example.demo.model.Reservation;

public interface IReservationService {

	// public abstract List<Reservation> getAllReservation();

	public abstract Reservation getReservation(Long id);

	public abstract Reservation addReservation(Reservation reservation);

}

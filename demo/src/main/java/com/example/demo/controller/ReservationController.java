package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.model.Reservation;
import com.example.demo.services.reservations.IReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	@Qualifier("reservationServiceImpl")
	private IReservationService reservationService;

	@GetMapping("/getReservation")
	public Reservation getReservation(Long id) {
		id = (long) 1;
		System.out.println("Reserv by id: " + id + reservationService.getReservation(id));
		return reservationService.getReservation(id);
	}

	@PostMapping("/addReservation")
	public void addReservation(@ModelAttribute("Reservation") Reservation reservation) {
		// Flight flightTest = new Flight(12,"test2",12 );
		// reservation = new Reservation(1, 12, flightTest);
		System.out.println("Post reservation successful " + reservation.getCedulaCliente() + reservation.getFlight());
		reservationService.addReservation(reservation);
	}

}

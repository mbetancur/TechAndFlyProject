package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.model.Reservation;
import com.example.demo.services.flights.IFlightService;
import com.example.demo.services.reservations.IReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	@Qualifier("reservationServiceImpl")
	private IReservationService reservationService;
	@Autowired
	@Qualifier("flightServiceImpl")
	private IFlightService flightService;

	// GETTIN ONE RESERVATION BY CEDULA
	// @GetMapping("/getReservation/{cedula}")
	// public Reservation getReservationByCedula(@PathVariable("cedula") int cedula)
	// {
	// // id = (long) 1;
	// System.out.println("Reserv by cedula: " + cedula +
	// reservationService.getReservationByCedula(cedula));
	// return reservationService.getReservationByCedula(cedula);
	// }

	@GetMapping("/getReservation/{cedula}")
	public List<Reservation> getReservationByCedula(@PathVariable("cedula") int cedula) {
		// id = (long) 1;
		System.out.println("Reserv by cedula: " + cedula + reservationService.getReservationByCedula(cedula));
		return reservationService.getReservationByCedula(cedula);
	}

	// GETTING A RESERVATION BY ID
	// @GetMapping("/getReservation")
	// public Reservation getReservation(Long id) {
	// id = (long) 1;
	// System.out.println("Reserv by id: " + id +
	// reservationService.getReservation(id));
	// return reservationService.getReservation(id);
	// }

	@PostMapping("/addReservation")
	public void addReservation(@RequestBody Reservation newReservation) {
		Flight f = flightService.getFlight(newReservation.getFlight().getId());
		Reservation reservation = new Reservation(newReservation.getCedulaCliente(), f);
		System.out.println("Post reservation successful " + reservation.getCedulaCliente() + reservation.getFlight());
		reservationService.addReservation(reservation);
	}

	// ADD RESERVATION AS AN OBJECT
	// @PostMapping("/addReservation")
	// public void addReservation(@ModelAttribute("Reservation") Reservation
	// reservation) {
	// // Flight flightTest = new Flight(2,"test",1);
	// // reservation = new Reservation(1, 12, flightTest);
	// // reservation = new Reservation(1, 12, reservation.getFlight());
	// System.out.println("Post reservation successful " +
	// reservation.getCedulaCliente() + reservation.getFlight());
	// reservationService.addReservation(reservation);
	// }

}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.services.flights.IFlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	@Qualifier("flightServiceImpl")
	private IFlightService flightService;

	@GetMapping("/getAllFlights")
	public List<Flight> getAllFlights() {
		System.out.println("Get Flights: " + flightService.getAllFlights());
		return flightService.getAllFlights();
	}

	@GetMapping("/getFlight/{id}")
	public Flight getFlight(@PathVariable("id") Long id) {
		// id = (long) 1;
		System.out.println("Fly by id: " + id + flightService.getFlight(id));
		return flightService.getFlight(id);
	}

	@PostMapping("/addFlight")
	public void addFlight(@ModelAttribute("Flights") Flight flight) {
		System.out.println("Post fligt successful " + flight.getDateTime() + flight.getFromTo());
		// fly = new Fly(10, "test10", 10);
		flightService.addFlight(flight);
	}

}

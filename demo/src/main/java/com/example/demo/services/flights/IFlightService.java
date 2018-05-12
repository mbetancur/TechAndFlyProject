package com.example.demo.services.flights;

import java.util.List;

import com.example.demo.model.Flight;

public interface IFlightService {

	public abstract List<Flight> getAllFlights();

	public abstract Flight getFlight(Long id);

	public abstract Flight addFlight(Flight flight);
}

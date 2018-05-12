/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services.flights;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;
import com.example.demo.repository.FlightRepository;

/**
 *
 * @author User
 */
@Service("flightServiceImpl")
public class FlightServiceImpl implements IFlightService {

	// @Autowired
	// private IFliesRespository repoFliesRespository;
	//
	// public void addFly(Fly newFly) {
	// // TODO: validate data info
	// repoFliesRespository.save(newFly);
	//
	// // Fly existFly = repoFliesRespository.findByDate("");
	//
	// // if (existFly != null) {
	// // // TODO: Exist a fly on this day. Do something
	// // }
	//
	// }

	@Autowired
	@Qualifier("flightRepository")
	private FlightRepository flightRepository;

	// public List<Fly> getDummieFlies() {
	// List<Fly> myList = new ArrayList<>();
	// myList.add(new Fly(1, "Test", 2));
	// myList.add(new Fly(2, "Test2", 3));
	// return myList;
	// }

	@Override
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

	@Override
	public Flight getFlight(Long id) {
		return flightRepository.findOne(id);

	}

	@Override
	public Flight addFlight(Flight flight) {
		return flightRepository.save(flight);
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services.flights;

import com.example.demo.model.Flight;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */
public interface IFliesRespository extends CrudRepository<Flight, Long> {

	// Fly findByDate(String date);

}

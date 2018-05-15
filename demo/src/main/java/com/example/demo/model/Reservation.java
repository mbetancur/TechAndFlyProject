/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "reservation")
public class Reservation {

	public Reservation() {

	}

	public Reservation(long id, int cedulaCliente, Flight flight) {
		super();
		this.id = id;
		this.cedulaCliente = cedulaCliente;
		this.flight = flight;
	}

	public Reservation(int cedulaCliente, Flight flight) {
		super();
		this.cedulaCliente = cedulaCliente;
		this.flight = flight;
	}

	@Id
	@GeneratedValue
	private long id;
	@Column(name = "cedulaCliente")
	private int cedulaCliente;
	@ManyToOne
	@JoinColumn(name = "idFlight")
	private Flight flight;

	// @Column(name = "idFlight")
	// private long idFlight;
	//
	// public long getIdFlight() {
	// return idFlight;
	// }
	//
	// public void setIdFlight(long idFlight) {
	// this.idFlight = idFlight;
	// }

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(int cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

}

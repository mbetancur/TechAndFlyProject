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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "flight")
public class Flight {

	public Flight() {

	}

	public Flight(long id, String fromTo, int dateTime) {
		this.id = id;
		this.fromTo = fromTo;
		this.dateTime = dateTime;
	}

	@Id
	@GeneratedValue
	private long id;
	@Column(name = "fromTo")
	private String fromTo;
	@Column(name = "dateTime")
	private int dateTime;
	// @OneToMany(mappedBy = "flight")
	// java.util.List<Reservation> reservations;
	//
	// public java.util.List<Reservation> getReservations() {
	// return reservations;
	// }
	//
	// public void setReservations(java.util.List<Reservation> reservations) {
	// this.reservations = reservations;
	// }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFromTo() {
		return fromTo;
	}

	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}

	public int getDateTime() {
		return dateTime;
	}

	public void setDateTime(int dateTime) {
		this.dateTime = dateTime;
	}

}

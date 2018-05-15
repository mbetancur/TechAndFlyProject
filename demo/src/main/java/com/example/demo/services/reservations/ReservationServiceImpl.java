package com.example.demo.services.reservations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Reservation;
import com.example.demo.repository.ReservationRepository;

@Service("reservationServiceImpl")
public class ReservationServiceImpl implements IReservationService {

	@Autowired
	@Qualifier("reservationRepository")
	private ReservationRepository reservationRepository;

	@Override
	public Reservation getReservation(Long id) {
		return reservationRepository.findOne(id);
	}

	@Override
	public Reservation addReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public List<Reservation> getReservationByCedula(int cedula) {
		return reservationRepository.findBycedulaCliente(cedula);
	}

}

import { Reservation } from './../model/reservation.model';
import { AddreservationService } from './../services/addreservation.service';
import { Component, OnInit } from '@angular/core';
import { Route } from '@angular/compiler/src/core';
import { ActivatedRoute } from '@angular/router';
import { Flight } from '../model/flight.model';

@Component({
  selector: 'app-addreservation',
  templateUrl: './addreservation.component.html',
  styleUrls: ['./addreservation.component.css'],
  providers: [AddreservationService]
})
export class AddreservationComponent implements OnInit {
  private reserva: Reservation;
  private idFlight: number;
  private cedula: number;

  constructor(private addreservationService: AddreservationService,
    private route: ActivatedRoute) { }

  ngOnInit() {
    this.idFlight = parseInt(this.route.snapshot.paramMap.get('id'))
    console.log(this.idFlight);
    //this.addReservation();
  }

  addReservation() {
    console.log(this.cedula + " inside component")
    let newReservation: Reservation = new Reservation();
    newReservation.flight = new Flight();
    newReservation.flight.id = this.idFlight;
    newReservation.cedulaCliente = this.cedula;
    this.addreservationService.addReservation(newReservation).subscribe(r => console.log(r));
  }
}

import { Flight } from './../model/flight.model';
import { FlightService } from './../services/flight.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css'],
  providers: [FlightService]
})
export class FlightComponent implements OnInit {
  private flights: Array<Flight>
  idFlight: any;
  checkage: boolean = false;
  constructor(private flightService: FlightService) { }

  ngOnInit() {
    this.loadFlights();
    this.idFlight = {
      id: ''
    };
  }

  private loadFlights(): void {
    console.log(this.checkage);
    this.flightService.getFlights().subscribe(res => {
      this.flights = res;
      console.log(res)
    });
  }
}

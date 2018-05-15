import { Flight } from './../model/flight.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
  // private flights: Array<Flight>;
  constructor(private http: HttpClient) { }

  public getFlights(): Observable<Flight[]> {
    return this.http.get<Flight[]>("http://localhost:8080/flight/getAllFlights")
  }
}

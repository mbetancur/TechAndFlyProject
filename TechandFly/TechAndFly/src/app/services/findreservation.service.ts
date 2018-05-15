import { Reservation } from './../model/reservation.model';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class FindreservationService {

  constructor(private http: HttpClient) { }

  public getReservation(id: number): Observable<Reservation[]> {
    return this.http.get<Reservation[]>("http://localhost:8080/reservation/getReservation/" + id)
  }
}

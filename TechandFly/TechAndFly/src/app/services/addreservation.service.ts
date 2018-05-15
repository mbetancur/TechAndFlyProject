import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, filter, scan } from 'rxjs/operators';
import { Reservation } from '../model/reservation.model';
import { HttpParamsOptions } from '@angular/common/http/src/params';

@Injectable({
  providedIn: 'root'
})
export class AddreservationService {

  private params: HttpParams;

  constructor(private http: HttpClient) { }

  public addReservation(reserva: Reservation) {
    console.log(reserva)
    return this.http.post("http://localhost:8080/reservation/addReservation", reserva)
  }

}

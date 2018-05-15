import { Reservation } from './../model/reservation.model';
import { FindreservationService } from './../services/findreservation.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-findreservation',
  templateUrl: './findreservation.component.html',
  styleUrls: ['./findreservation.component.css'],
  providers: [FindreservationService]
})
export class FindreservationComponent implements OnInit {
  private reservs: Array<Reservation>
  private idReservation: number
  constructor(private findreservationService: FindreservationService) { }

  ngOnInit() {
    // this.findReservation();
  }

  private findReservation(): void {
    this.findreservationService.getReservation(this.idReservation).subscribe(res => {
      this.reservs = res;
      console.log(res)
    });
  }
}

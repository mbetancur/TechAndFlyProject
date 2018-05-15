import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from "@angular/common/http";
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './routes/app-routes.module';
import { AppComponent } from './app.component';
import { FlightComponent } from './flight/flight.component';
import { AddreservationComponent } from './addreservation/addreservation.component';
import { FindreservationComponent } from './findreservation/findreservation.component';

@NgModule({
  declarations: [
    AppComponent,
    FlightComponent,
    AddreservationComponent,
    FindreservationComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

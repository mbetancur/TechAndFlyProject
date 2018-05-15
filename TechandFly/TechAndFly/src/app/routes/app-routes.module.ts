import { AppComponent } from './../app.component';
import { RouterModule, Routes } from '@angular/router'
import { NgModule, Component } from '@angular/core';
import { AddreservationComponent } from '../addreservation/addreservation.component';
import { FindreservationComponent } from './../findreservation/findreservation.component';
import { FlightComponent } from './../flight/flight.component';

const routes: Routes = [
    { path: '', redirectTo: '/flightComponent', pathMatch: 'full' },
    { path: 'appComponent', component: AppComponent },
    { path: 'flightComponent', component: FlightComponent },
    { path: 'addreservationComponent/:id', component: AddreservationComponent },
    { path: 'findreservationComponent', component: FindreservationComponent }


];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],

})
export class AppRoutingModule { }
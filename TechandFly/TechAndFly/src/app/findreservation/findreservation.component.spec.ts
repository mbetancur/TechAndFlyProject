import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FindreservationComponent } from './findreservation.component';

describe('FindreservationComponent', () => {
  let component: FindreservationComponent;
  let fixture: ComponentFixture<FindreservationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FindreservationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FindreservationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

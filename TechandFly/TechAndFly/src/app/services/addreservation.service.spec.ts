import { TestBed, inject } from '@angular/core/testing';

import { AddreservationService } from './addreservation.service';

describe('AddreservationService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AddreservationService]
    });
  });

  it('should be created', inject([AddreservationService], (service: AddreservationService) => {
    expect(service).toBeTruthy();
  }));
});

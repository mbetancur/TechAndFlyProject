import { TestBed, inject } from '@angular/core/testing';

import { FindreservationService } from './findreservation.service';

describe('FindreservationService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [FindreservationService]
    });
  });

  it('should be created', inject([FindreservationService], (service: FindreservationService) => {
    expect(service).toBeTruthy();
  }));
});

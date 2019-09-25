import { TestBed } from '@angular/core/testing';

import { UOwnedPetsService } from './u-owned-pets.service';

describe('UOwnedPetsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: UOwnedPetsService = TestBed.get(UOwnedPetsService);
    expect(service).toBeTruthy();
  });
});

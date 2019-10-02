import { TestBed } from '@angular/core/testing';

import { InNetworkVetsService } from './in-network-vets.service';

describe('InNetworkVetsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: InNetworkVetsService = TestBed.get(InNetworkVetsService);
    expect(service).toBeTruthy();
  });
});

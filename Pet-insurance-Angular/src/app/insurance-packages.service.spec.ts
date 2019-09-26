import { TestBed } from '@angular/core/testing';

import { InsurancePackagesService } from './insurance-packages.service';

describe('InsurancePackagesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: InsurancePackagesService = TestBed.get(InsurancePackagesService);
    expect(service).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { UserCCpaymentServiceService } from './user-ccpayment-service.service';

describe('UserCCpaymentServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: UserCCpaymentServiceService = TestBed.get(UserCCpaymentServiceService);
    expect(service).toBeTruthy();
  });
});

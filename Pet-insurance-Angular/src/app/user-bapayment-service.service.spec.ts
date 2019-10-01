import { TestBed } from '@angular/core/testing';

import { UserBApaymentServiceService } from './user-bapayment-service.service';

describe('UserBApaymentServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: UserBApaymentServiceService = TestBed.get(UserBApaymentServiceService);
    expect(service).toBeTruthy();
  });
});

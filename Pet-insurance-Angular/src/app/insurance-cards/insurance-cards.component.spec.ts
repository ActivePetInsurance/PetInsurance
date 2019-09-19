import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsuranceCardsComponent } from './insurance-cards.component';

describe('InsuranceCardsComponent', () => {
  let component: InsuranceCardsComponent;
  let fixture: ComponentFixture<InsuranceCardsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsuranceCardsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsuranceCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

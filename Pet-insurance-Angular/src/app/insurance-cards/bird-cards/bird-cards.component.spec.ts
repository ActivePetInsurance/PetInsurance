import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BirdCardsComponent } from './bird-cards.component';

describe('BirdCardsComponent', () => {
  let component: BirdCardsComponent;
  let fixture: ComponentFixture<BirdCardsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BirdCardsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BirdCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RodentCardsComponent } from './rodent-cards.component';

describe('RodentCardsComponent', () => {
  let component: RodentCardsComponent;
  let fixture: ComponentFixture<RodentCardsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RodentCardsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RodentCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

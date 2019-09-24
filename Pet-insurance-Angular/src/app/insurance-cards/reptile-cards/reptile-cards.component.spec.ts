import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReptileCardsComponent } from './reptile-cards.component';

describe('ReptileCardsComponent', () => {
  let component: ReptileCardsComponent;
  let fixture: ComponentFixture<ReptileCardsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReptileCardsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReptileCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

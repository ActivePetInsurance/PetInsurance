import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InNetworkVetsComponent } from './in-network-vets.component';

describe('InNetworkVetsComponent', () => {
  let component: InNetworkVetsComponent;
  let fixture: ComponentFixture<InNetworkVetsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InNetworkVetsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InNetworkVetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

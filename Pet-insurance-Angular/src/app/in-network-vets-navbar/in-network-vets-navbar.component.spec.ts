import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InNetworkVetsNavbarComponent } from './in-network-vets-navbar.component';

describe('InNetworkVetsNavbarComponent', () => {
  let component: InNetworkVetsNavbarComponent;
  let fixture: ComponentFixture<InNetworkVetsNavbarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InNetworkVetsNavbarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InNetworkVetsNavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

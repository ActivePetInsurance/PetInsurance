import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SignupNavbarComponent } from './signup-navbar.component';

describe('SignupNavbarComponent', () => {
  let component: SignupNavbarComponent;
  let fixture: ComponentFixture<SignupNavbarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SignupNavbarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SignupNavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

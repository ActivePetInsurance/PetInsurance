import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';
import { UserSignupService } from '../user-signup.service';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  initSignUp = new FormGroup({
  email: new FormControl(''),
  fName: new FormControl(''),
  lName: new FormControl(''),
  bDate: new FormControl(''),
  add1: new FormControl(''),
  add2: new FormControl(''),
  city: new FormControl(''),
  zip: new FormControl(''),
  phoneNum: new FormControl(''),
  password: new FormControl(''),
  passwordC: new FormControl('')
  });

  constructor(private router: Router, private usignup: UserSignupService) { }

  ngOnInit() {
    console.log('cleared');
    // tslint:disable-next-line: no-unused-expression
    localStorage.removeItem('owner');
  }

  signup(SignInWhat): void {
    if (this.initSignUp.value.password === this.initSignUp.value.passwordC) {
      console.log(this.initSignUp.value);
      this.usignup.usignup(this.initSignUp.value).subscribe(
        data => {
          this.routing();
        }
      );
     } else {
       alert('Passwords Do Not Match');
     }
  }

  routing(): void {
    this.router.navigate(['/welcome']);
  }
}

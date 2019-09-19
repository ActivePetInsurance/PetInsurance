import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  initSignUp = new FormGroup({
  email: new FormControl(''),
  password: new FormControl(''),
  passwordC: new FormControl('')
  });

  constructor(private router: Router) { }

  ngOnInit() {
  }

  signup(): void {
    if (this.initSignUp.value.password === this.initSignUp.value.passwordC) {
      console.log(this.initSignUp.value);
      console.log('in success');
      this.router.navigate(['/register']);
     } else {
       alert('Passwords Do Not Match');
     }
  }
}

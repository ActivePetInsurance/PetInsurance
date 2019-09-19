import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  SignIn = new FormGroup({
    email: new FormControl(''),
    password: new FormControl('')
    });

  constructor(private router: Router) { }

  ngOnInit() {
  }

  signin(): void {
    if (this.SignIn.value.email === 'fake@gmail.com' && this.SignIn.value.password === 'admin') {
      console.log(this.SignIn.value);
      console.log('in success');
      this.router.navigate(['/user']);
     } else {
       alert('Passwords Do Not Match');
     }
  }


}

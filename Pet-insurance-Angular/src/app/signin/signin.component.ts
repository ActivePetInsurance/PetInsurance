import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { UserSigninService } from '../user-signin.service';

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

    private loginVal: string;

  constructor(private router: Router, private usignin: UserSigninService) { }

  ngOnInit() {
  }


  signin(SignInWhat): void {
    console.log(this.SignIn.value);
    let loggerUser;
    this.usignin.signin(this.SignIn.value).subscribe(
      data => {
        const ourField = 'message';
        console.log(data);
        loggerUser = data;
        if (loggerUser) {
          localStorage.setItem('owner', JSON.stringify(data));
          this.router.navigate(['/user']);
        } else {
          alert('Login Failed');
        }
      }
    );


  }

}

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

    

  constructor(private router: Router, private usignin: UserSigninService, private loginVal: string) { }

  ngOnInit() {
  }


  signin(SignIn): void {
    console.log('third button clicked');

    this.usignin.signin(SignIn).subscribe(
      data => {
        console.log(data);
      }
    );

      // this.router.navigate(['/user']);
  }

}

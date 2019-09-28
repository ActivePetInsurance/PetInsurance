import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signin-navbar',
  templateUrl: './signin-navbar.component.html',
  styleUrls: ['./signin-navbar.component.css']
})
export class SigninNavbarComponent implements OnInit {

  title = 'A+ Pets';

  constructor() { }

  ngOnInit() {
  }

  signOut() {
    // tslint:disable-next-line: no-unused-expression
    console.log("cleared");
    // tslint:disable-next-line: no-unused-expression
    localStorage.removeItem('owner');
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  private email: string;
  private password: string;
  private passwordC: string;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  signup(): void {
    if (this.password === this.passwordC) {
      console.log(this.email + ' ' + this.password +  ' ' + this.passwordC);
      console.log('in success');
      this.router.navigate(['/register']);
     } else {
       alert('Passwords Do Not Match');
     }
  }

}

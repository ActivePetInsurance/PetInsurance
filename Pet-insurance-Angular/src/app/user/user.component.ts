import { Component, OnInit } from '@angular/core';
import { UserInfo } from '../UserInfo.1';
import { UserServiceService } from '../user-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  userInfo: UserInfo[] = [];

  constructor(private sessionUser: UserServiceService, private router: Router) {
    this.userInfo = sessionUser.getUserInfo();
  }

  ngOnInit() {
    if(localStorage.getItem('owner') == null) {
      this.router.navigate(['/elcome']);
    }
  }

}

import { Component, OnInit } from '@angular/core';
import { UserInfo } from '../UserInfo.1';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  userInfo: UserInfo[] = [];

  constructor(private sessionUser: UserServiceService) {
    this.userInfo = sessionUser.getUserInfo();
    console.log(this.userInfo);
  }

  ngOnInit() {
  }

}

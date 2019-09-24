import { Component, OnInit } from '@angular/core';
import { UserInfo } from '../UserInfo.1';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit {

   userInfo: UserInfo[] = [];
   showForm = false;

  constructor(private sessionUser: UserServiceService) {
    this.userInfo = sessionUser.getUserInfo();
    console.log(this.userInfo);
  }

  toggle() {
    this.showForm = !this.showForm;
  }

  ngOnInit() {
  }

}

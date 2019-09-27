import { Component, OnInit } from '@angular/core';
import { UserInfo } from '../UserInfo.1';
import { UserServiceService } from '../user-service.service';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit {

  infoChange = new FormGroup({
    emailC: new FormControl(''),
    add1C: new FormControl(''),
    add2C: new FormControl(''),
    cityC: new FormControl(''),
    zipC: new FormControl(''),
    phoneNumC: new FormControl('')
    });
   userInfo: UserInfo[] = [];
   showForm = false;

  constructor(private sessionUser: UserServiceService) {
    this.userInfo = sessionUser.getUserInfo();
    console.log(this.userInfo);
  }

  toggle() {
    this.showForm = !this.showForm;
  }

  info_Change() {
    console.log(this.infoChange.value);
    this.toggle();
  }

  ngOnInit() {
    this.sessionUser.getLoggedUser().subscribe(
      data => {
        console.log('loggedUser: ' + data);
      }
    );
  }

}

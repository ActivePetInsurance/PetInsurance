import { Component, OnInit, OnDestroy } from '@angular/core';
import { UserInfo } from '../UserInfo.1';
import { UserServiceService } from '../user-service.service';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit, OnDestroy {

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

  constructor(private router: Router, private sessionUser: UserServiceService) {
    this.userInfo = sessionUser.getUserInfo();
  }

  toggle() {
    this.showForm = !this.showForm;
  }

  info_Change() {
    this.updateUser();
    this.toggle();
  }

  ngOnInit() {
    if(localStorage.getItem('owner') == null) {
      this.router.navigate(['/welcome']);
    }
  }
  ngOnDestroy(): void {
  }

  updateUser() {
    this.sessionUser.curUserUpdate(this.userInfo).subscribe(
      data => {
        const ourField = 'message';
        localStorage.removeItem('owner');
        localStorage.setItem('owner', JSON.stringify(data));
        this.router.navigate(['/user']);
        }
    );
  }

}

import { Injectable } from '@angular/core';
import { UserInfo } from './UserInfo.1';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  curOwner = JSON.parse(localStorage.getItem('owner'));

  getUserInfo(): UserInfo[] {
    return [
      {
        email: this.curOwner.email,
        fName: this.curOwner.firstName,
        mInit: this.curOwner.middleInitial,
        lName: this.curOwner.lastName,
        bDate: this.curOwner.dob,
        add: this.curOwner.streetAddress,
        city: this.curOwner.city,
        zip: this.curOwner.zipCode,
        phoneNum: this.curOwner.phoneNumber
      }
    ];
  }

  constructor(private myHttpCli: HttpClient) { }

  getLoggedUser(): Observable<string[]> {
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
          'withCredentials': 'true'
      })
    };
    return this.myHttpCli.get<string[]>('http://localhost:9005/RevaturePetInsurance/log/getCurrentInfo.app', {withCredentials: true} );
}


}

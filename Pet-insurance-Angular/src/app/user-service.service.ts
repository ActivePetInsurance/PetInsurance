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
        accNum: this.curOwner.accountNumber,
        email: this.curOwner.email,
        fName: this.curOwner.firstName,
        mInit: this.curOwner.middleInitial,
        lName: this.curOwner.lastName,
        bDate: this.curOwner.dob,
        add: '423 Bruce B Downs',
        city: this.curOwner.city,
        zip: this.curOwner.zipCode,
        phoneNum: this.curOwner.phoneNumber,
        password: this.curOwner.password
      }
    ];
  }

  constructor(private myHttpCli: HttpClient) { }

  curUserUpdate(upUser): Observable<string[]> {
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
          'withCredentials': 'true'
      })
    };

    // return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/own/updateOwner.app', upUser, httpPut);
    return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/own/updateOwner.app', upUser, httpPut);
}


}

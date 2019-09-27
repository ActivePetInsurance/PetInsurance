import { Injectable } from '@angular/core';
import { UserInfo } from './UserInfo.1';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  getUserInfo(): UserInfo[] {
    return [
      {
        email: 'fakeUser@gmail.com',
        fName: 'Tester',
        lName: 'McTestington',
        bDate: '1990-09-30',
        add1: '1234 Main st.',
        add2: ' ',
        city: 'Reston',
        zip: '20170',
        phoneNum: '123-456-7890'
      }
    ];
  }

  constructor(private myHttpCli: HttpClient) { }

  getLoggedUser(): Observable<string[]> {
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
          withCredentials: 'true'
      })
    };
    return this.myHttpCli.get<string[]>('http://localhost:9005/RevaturePetInsurance/log/getCurrentInfo.app', httpPut);
}


}

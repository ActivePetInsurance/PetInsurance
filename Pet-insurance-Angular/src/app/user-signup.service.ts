import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserInfo } from './UserInfo.1';

@Injectable({
  providedIn: 'root'
})
export class UserSignupService {

  constructor(private myHttpCli: HttpClient) { }

  usignup(newUser: UserInfo): Observable<string[]> {
    console.log(newUser);
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };

    // return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/own/addOwner.app', newUser, httpPut);
    return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/own/addOwner.app', newUser, httpPut);
  }
}


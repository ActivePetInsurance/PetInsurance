import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { userSignIn } from 'src/environments/userSignIn';
import { UserInfo } from './UserInfo.1';

@Injectable({
  providedIn: 'root'
})
export class UserSigninService {

  constructor(private myHttpCli: HttpClient) { }

  signin(user: userSignIn): Observable<string[]> {
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
        withCredentials: 'true'
      })
    };

    // return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/log/login.app', user, httpPut);
    return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/log/login.app', user, httpPut);
  }
}

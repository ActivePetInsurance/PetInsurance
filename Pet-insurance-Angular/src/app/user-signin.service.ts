import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { userSignIn } from 'src/environments/userSignIn';

@Injectable({
  providedIn: 'root'
})
export class UserSigninService {

  constructor(private myHttpCli: HttpClient) { }

  signin(user: userSignIn): Observable<string[]> {
    console.log(user);
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    };

    return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/log/login.app', user, httpPut);
  }
}

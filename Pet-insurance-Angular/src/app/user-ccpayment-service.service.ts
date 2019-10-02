import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { CCinfo } from 'src/CCPaymentinfo';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserCCpaymentServiceService {

  constructor(private myHttpCli: HttpClient) { }

  upayCC(newCC: CCinfo): Observable<string[]> {
    console.log(newCC);
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    // return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/payment/makePaymentCC.app', newCC, httpPut);
    // tslint:disable-next-line: max-line-length
    return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/payment/makePaymentCC.app', newCC, httpPut);
  }
}

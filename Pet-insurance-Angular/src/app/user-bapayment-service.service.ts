import { Injectable } from '@angular/core';
import { BAInfo } from 'src/BAPaymentinfo';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})

export class UserBAPaymentService {

    constructor(private myHttpcli: HttpClient) { }

    upayBA(newBA: BAInfo): Observable<string[]> {
        console.log(newBA);
        const httpPut = {
            headers: new HttpHeaders({
                'Content-Type': 'application/json'
            })
        };
        return this.myHttpcli.post<string[]>('http://localhost:9005/RevaturePetInsurance/payment/makePaymentBA.app', newBA, httpPut);
        // return this.myHttpcli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/payment/makePaymentBA.app', newBA, httpPut);
    }
}

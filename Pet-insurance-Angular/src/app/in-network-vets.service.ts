import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { VetsinNetwork } from './in-network-vets/VetsInNetwork';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InNetworkVetsService {

  constructor(private myHttpCli: HttpClient) { }

    getVets(): Observable<string[]> {
      // const httpPut = {
      //   headers: new HttpHeaders({
      //     'Content-Type':  'application/json',
      //     withCredentials: 'true'
      //   })
      // };
      return this.myHttpCli.get<string[]>('http://localhost:9005/RevaturePetInsurance/vet/allVets.app');
      // return this.myHttpCli.get<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/vet/allVets.app');
    }
}

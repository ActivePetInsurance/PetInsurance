import { Injectable } from '@angular/core';
import { Pet } from './pet';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UOwnedPetsService {

  getUserPetInfo(): Pet[] {
    return [
      {
        name: 'Jet',
        bDate: '2013',
        weight: '3.7',
        height: '4.1',
        age: '6',
        petSize: 'Medium',
        petSex: 'Male',
        petType: 'Bird'
      },
      {
        name: 'Wings',
        bDate: '2010',
        weight: '2.0',
        height: '2.7',
        age: '9',
        petSize: 'Small',
        petSex: 'Female',
        petType: 'Bird'
      },
      {
        name: 'Scales',
        bDate: '2012',
        weight: '6.5',
        height: '4.1',
        age: '7',
        petSize: 'Medium',
        petSex: 'Female',
        petType: 'Reptile'
      },
      {
        name: 'Peanut',
        bDate: '2013',
        weight: '3.2',
        height: '7.2',
        age: '6',
        petSize: 'Medium',
        petSex: 'Male',
        petType: 'Rodent'
      }
    ];
  }

  constructor(private myHttpCli: HttpClient) { }

  getOwnerPets(): Observable<string[]> {
    const curUser = JSON.parse(localStorage.getItem('owner'));
    console.log(curUser);
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
          'withCredentials': 'true'
      })
    };
    console.log('before return');

    // return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/own/getPets.app', curUser, httpPut);
    return this.myHttpCli.post<string[]>('http://35.232.12.74:32420/TCP/RevaturePetInsurance/own/getPets.app', curUser, httpPut);
}

}

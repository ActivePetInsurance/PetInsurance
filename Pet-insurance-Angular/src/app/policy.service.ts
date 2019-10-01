import { Injectable } from '@angular/core';
import { Policy } from './Policy';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { NewPolicy } from './user-plans/newPolicy';
import { PolicyPets } from './PolicyPet';

@Injectable({
  providedIn: 'root'
})
export class PolicyService {

  pol: NewPolicy[];
  petPol: PolicyPets[];
  getPolInfo(): Policy[] {
    return [
    {
      PolicyNumber: '0000064',
      Plan: 'Bird A',
      Pet1: 'Jet',
      Pet2: 'Wings',
      Pet3: null
    },
    {
      PolicyNumber: '0000065',
      Plan: 'Reptile B',
      Pet1: 'Scales',
      Pet2: null,
      Pet3: null
    },
    {
      PolicyNumber: '0000066',
      Plan: 'Rodent B',
      Pet1: 'Peanut',
      Pet2: null,
      Pet3: null
    }
    ];
  }

  constructor(private myHttpCli: HttpClient) { }

  addNewPlan(newPol): Observable<string[]> {
      const curUser = JSON.parse(localStorage.getItem('owner'));
      this.pol = [
        {
        accNum: curUser.accountNumber,
        email: curUser.email,
        fName: curUser.firstName,
        mInit: curUser.middleInitial,
        lName: curUser.lastName,
        bDate: curUser.dob,
        add: curUser.streetAddress,
        city: curUser.city,
        zip: curUser.zipCode,
        phoneNum: curUser.phoneNumber,
        password: curUser.password,
        polPetType: newPol.value.polPetType,
        polPlanType: newPol.value.polPlanType,
        newPetName: newPol.value.newPetName,
        newbDate: newPol.value.newbDate,
        newWeight: newPol.value.newWeight,
        newHeight: newPol.value.newHeight,
        newAge: newPol.value.newAge,
        newPetSize: newPol.value.newPetSize,
        newPetSex: newPol.value.newPetSex
        }
      ],
      console.log(this.pol);
      const httpPut = {
        headers: new HttpHeaders({
          'Content-Type':  'application/json',
            'withCredentials': 'true'
        })
      };

      return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/own/addPolicy.app', this.pol, httpPut);
      // return this.myHttpCli.post<string[]>('http://35.232.12.74:32420/TCP/RevaturePetInsurance/own/addPolicy.app', this.pol, httpPut);
  }

  getPlans(): Observable<string[]> {
    const curUser = JSON.parse(localStorage.getItem('owner'));

    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
          'withCredentials': 'true'
      })
    };
    console.log('before Plans return');

    return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/own/getPolicy.app', curUser, httpPut);
    // return this.myHttpCli.post<string[]>('http://35.232.12.74:32420/TCP/RevaturePetInsurance/own/getPolicy.app', curUser, httpPut);
  }

  addPetToPlans(newPetPol): Observable<string[]> {
    const curUser = JSON.parse(localStorage.getItem('owner'));
    this.petPol = [
      {
        accNum: curUser.accountNumber,
        PolNum: newPetPol.value.polNum,
        newPetName: newPetPol.value.newPetName,
        newbDate: newPetPol.value.newbDate,
        newWeight: newPetPol.value.newWeight,
        newHeight: newPetPol.value.newHeight,
        newAge: newPetPol.value.newAge,
        newPetSize: newPetPol.value.newPetSize,
        newPetSex: newPetPol.value.newPetSex
      }
    ];
    console.log(this.petPol);
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
          'withCredentials': 'true'
      })
    };
    console.log('before add pets');

    // return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/own/NewPet.app', this.petPol, httpPut);
    return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/own/NewPet.app', this.petPol, httpPut);
  }

}

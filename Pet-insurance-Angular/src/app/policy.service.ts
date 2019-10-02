import { Injectable } from '@angular/core';
import { Policy } from './Policy';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { NewPolicy } from './user-plans/newPolicy';
import { PolicyPets } from './PolicyPet';
import { RemovePol } from './removePolicy';

@Injectable({
  providedIn: 'root'
})
export class PolicyService {

  age;
  age1;
  remPol: RemovePol[];
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
      const date = newPol.value.newbDate.split(['-']);
      this.age = 2019 - date[0];
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
        newAge: this.age,
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
      // return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/own/addPolicy.app', this.pol, httpPut);
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
    // return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/own/getPolicy.app', curUser, httpPut);
  }

  addPetToPlans(newPetPol): Observable<string[]> {
    const curUser = JSON.parse(localStorage.getItem('owner'));
    const date = newPetPol.value.newbDate.split(['-']);
    this.age = 2019 - date[0];
    this.petPol = [
      {
        accNum: curUser.accountNumber,
        PolNum: newPetPol.value.polNum,
        newPetName: newPetPol.value.newPetName,
        newbDate: newPetPol.value.newbDate,
        newWeight: newPetPol.value.newWeight,
        newHeight: newPetPol.value.newHeight,
        newAge: this.age,
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

    return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/own/NewPet.app', this.petPol, httpPut);
    // return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/own/NewPet.app', this.petPol, httpPut);
  }

  remove_Policy(policyRem): Observable<string[]> {
    const curUser = JSON.parse(localStorage.getItem('owner'));
    this.remPol = [
    {
      polNum: policyRem.value.polNum,
      accNum: curUser.accountNumber
    }
  ];
    const httpPut = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
          'withCredentials': 'true'
      })
    };
    console.log('before Plans return');

    return this.myHttpCli.post<string[]>('http://localhost:9005/RevaturePetInsurance/own/removePolicy.app', this.remPol, httpPut);
    // return this.myHttpCli.post<string[]>('http://35.232.12.74/RevaturePetInsurance-0.0.1-SNAPSHOT/own/getPolicy.app', curUser, httpPut);
  }

}

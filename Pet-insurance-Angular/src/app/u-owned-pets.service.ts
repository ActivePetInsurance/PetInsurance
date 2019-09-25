import { Injectable } from '@angular/core';
import { Pet } from './pet';

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

  constructor() { }
}

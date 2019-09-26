import { Injectable } from '@angular/core';
import { Policy } from './Policy';

@Injectable({
  providedIn: 'root'
})
export class PolicyService {

  getPolInfo(): Policy[] {
    return [
    {
      PolicyNumber: '0000064',
      Plan: 'Bird A',
      Pets: ['Jet', 'Wings']
    },
    {
      PolicyNumber: '0000065',
      Plan: 'Reptile B',
      Pets: ['Scales']
    },
    {
      PolicyNumber: '0000066',
      Plan: 'Rodent B',
      Pets: ['Peanut']
    }
    ];
  }

  constructor() { }
}

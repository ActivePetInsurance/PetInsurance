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

  constructor() { }
}

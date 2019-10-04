import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IPetPlans } from './animals';

@Injectable({
  providedIn: 'root'
})
export class InsurancePackagesService {
/*   private url = 'https://api.myjson.com/bins/j9w21';

  constructor(private httpCli: HttpClient) { } */

  getAnimals(): IPetPlans[] {
    return [
        {
            name: 'Birds',
            desc: 'Bird Plan'
        },
        {
            name: 'Rodents',
            desc: 'Rodent Plan'
        },
        {
            name: 'Reptiles',
            desc: 'Reptile Plan'
        }
    ];
}
}

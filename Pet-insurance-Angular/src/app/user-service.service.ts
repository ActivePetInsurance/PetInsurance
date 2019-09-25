import { Injectable } from '@angular/core';
import { UserInfo } from './UserInfo.1';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  getUserInfo(): UserInfo[] {
    return [
      {
        email: 'fakeUser@gmail.com',
        fName: 'Tester',
        lName: 'McTestington',
        bDate: '1990-09-30',
        add1: '1234 Main st.',
        add2: ' ',
        city: 'Reston',
        zip: '20170',
        phoneNum: '123-456-7890'
      }
    ];
  }

  constructor() { }
}

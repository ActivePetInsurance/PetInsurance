import { Injectable } from '@angular/core';
import { UserInfo } from './userInfo';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  getUserInfo(): UserInfo {
    return new UserInfo('fakeUser@gmail.com', 'Tester', 'McTestington', '1990-09-30', '1234 Main st.', ' ', 'Reston', '20170');
  }

  constructor() { }
}

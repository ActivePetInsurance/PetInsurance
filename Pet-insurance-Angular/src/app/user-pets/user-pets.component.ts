import { Component, OnInit } from '@angular/core';
import { Pet } from '../pet';
import { UOwnedPetsService } from '../u-owned-pets.service';

@Component({
  selector: 'app-user-pets',
  templateUrl: './user-pets.component.html',
  styleUrls: ['./user-pets.component.css']
})
export class UserPetsComponent implements OnInit {

  userPets: Pet[] = [];
  constructor(private userPetServ: UOwnedPetsService) {
    this.userPets = userPetServ.getUserPetInfo();
}
  ngOnInit() {
  }

}

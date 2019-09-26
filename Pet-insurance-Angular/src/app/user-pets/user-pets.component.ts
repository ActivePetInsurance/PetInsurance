import { Component, OnInit } from '@angular/core';
import { Pet } from '../pet';
import { UOwnedPetsService } from '../u-owned-pets.service';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-user-pets',
  templateUrl: './user-pets.component.html',
  styleUrls: ['./user-pets.component.css']
})
export class UserPetsComponent implements OnInit {

  userPets: Pet[] = [];
  showForm = false;
  newPet = new FormGroup({
    newPetName: new FormControl(''),
    newbDate: new FormControl(''),
    newWeight: new FormControl(''),
    newHeight: new FormControl(''),
    newAge: new FormControl(''),
    newPetSize: new FormControl(''),
    newPetSex: new FormControl(''),
    newPetType: new FormControl('')
    });
  constructor(private userPetServ: UOwnedPetsService) {
    this.userPets = userPetServ.getUserPetInfo();
}

toggle() {
  this.showForm = !this.showForm;
}
  ngOnInit() {
  }
  new_Pet() {
    console.log(this.newPet.value);
    this.toggle();
  }

}

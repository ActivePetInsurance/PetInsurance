import { Component, OnInit } from '@angular/core';
import { Pet } from '../pet';
import { UOwnedPetsService } from '../u-owned-pets.service';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-pets',
  templateUrl: './user-pets.component.html',
  styleUrls: ['./user-pets.component.css']
})
export class UserPetsComponent implements OnInit {

  ownerPets;
  ownerPetLen;
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
  constructor(private router: Router, private userPetServ: UOwnedPetsService) {
    this.userPets = userPetServ.getUserPetInfo();
}

toggle() {
  this.showForm = !this.showForm;
}

ngOnInit() {
  if(localStorage.getItem('owner') == null) {
    this.router.navigate(['/welcome']);
  }
  this.userPetServ.getOwnerPets().subscribe(
    data => {
      this.ownerPets = data;
      this.ownerPetLen = data.length;
      });
  }

  new_Pet() {
    this.toggle();
  }

}

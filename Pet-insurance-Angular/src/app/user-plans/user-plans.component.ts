import { Component, OnInit } from '@angular/core';
import { Policy } from '../Policy';
import { PolicyService } from '../policy.service';
import { FormGroup,  FormControl } from '@angular/forms';

@Component({
  selector: 'app-user-plans',
  templateUrl: './user-plans.component.html',
  styleUrls: ['./user-plans.component.css']
})
export class UserPlansComponent implements OnInit {

  newPol = new FormGroup({
    polPetType: new FormControl(''),
    polPlanType: new FormControl(''),
    newPetName: new FormControl(''),
    newbDate: new FormControl(''),
    newWeight: new FormControl(''),
    newHeight: new FormControl(''),
    newAge: new FormControl(''),
    newPetSize: new FormControl(''),
    newPetSex: new FormControl('')
    });

  userPolicy: Policy[] = [];
  constructor(private userPol: PolicyService) {
    this.userPolicy = userPol.getPolInfo();
    console.log(this.userPolicy);
   }

  ngOnInit() {
    this.userPol.getPlans().subscribe(
      data => {
        console.log(data);
        });
  }

  new_Policy() {
    console.log(this.newPol.value);
    this.userPol.addNewPlan(this.newPol).subscribe(
      data => {
        console.log(data);
        });
  }

}

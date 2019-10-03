import { Component, OnInit } from '@angular/core';
import { Policy } from '../Policy';
import { PolicyService } from '../policy.service';
import { FormGroup,  FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-plans',
  templateUrl: './user-plans.component.html',
  styleUrls: ['./user-plans.component.css']
})
export class UserPlansComponent implements OnInit {

  owerPol;
  polCheck;

  remPlan = new FormGroup({
    polNum: new FormControl('')
  });

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

    newPet = new FormGroup({
      polNum: new FormControl(''),
      newPetName: new FormControl(''),
      newbDate: new FormControl(''),
      newWeight: new FormControl(''),
      newHeight: new FormControl(''),
      newAge: new FormControl(''),
      newPetSize: new FormControl(''),
      newPetSex: new FormControl('')
      });

  userPolicy: Policy[] = [];
  constructor(private router: Router, private userPol: PolicyService) {
    this.userPolicy = userPol.getPolInfo();
    console.log(this.userPolicy);
   }

  ngOnInit() {
    if(localStorage.getItem('owner') == null) {
      this.router.navigate(['/welcome']);
    }
    this.userPol.getPlans().subscribe(
      data => {
        console.log('get policy: ');
        console.log(data);
        this.owerPol = data;
        });
  }

  new_Policy() {
    console.log(this.newPol.value);
    this.userPol.addNewPlan(this.newPol).subscribe(
      data => {
        console.log(data);
        location.reload()
        });
  }

  new_PetToPol(): void {
    this.userPol.getPlans().subscribe(
      data => {
        console.log('get policy: ');
        console.log(data);
        this.polCheck = data;
        let iCount = 0;
        for (const plan of this.polCheck) {
          console.log(plan);
          console.log(this.newPet.value.polNum);
          console.log(plan.policyNumber);
          console.log(plan.petList.length);
          if (this.newPet.value.polNum == plan.policyNumber) {
            iCount++;
            if (plan.petList.length < 3) {
              this.userPol.addPetToPlans(this.newPet).subscribe(
                data1 => {
                  console.log(data1);
                }
              );
             } else {
              console.log('TOOO MUCH');
              alert('This Policy already has 3 Pets, please add a new Policy');
           }
          }
         }
        if (iCount == 0) {
          console.log('NO PLAN');
          alert('Invalide policy number');
        }
        location.reload();
        });
  }

  remove_Policy() {
    this.userPol.remove_Policy(this.remPlan).subscribe(
      data => {
        console.log(data);
      }
    );
  }

}

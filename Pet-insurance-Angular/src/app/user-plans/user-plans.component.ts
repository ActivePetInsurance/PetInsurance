import { Component, OnInit } from '@angular/core';
import { Policy } from '../Policy';
import { PolicyService } from '../policy.service';

@Component({
  selector: 'app-user-plans',
  templateUrl: './user-plans.component.html',
  styleUrls: ['./user-plans.component.css']
})
export class UserPlansComponent implements OnInit {

  userPolicy: Policy[] = [];
  constructor(private userPol: PolicyService) {
    this.userPolicy = userPol.getPolInfo();
    console.log(this.userPolicy);
   }

  ngOnInit() {
  }

}

import { Component, OnInit } from '@angular/core';
import { IPetPlans } from '../animals';
import { InsurancePackagesService } from '../insurance-packages.service';
import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-insurance-cards',
  templateUrl: './insurance-cards.component.html',
  styleUrls: ['./insurance-cards.component.css']
})
export class InsuranceCardsComponent implements OnInit {
  petplans: IPetPlans[] = [];
  animalForm: FormGroup;
  petValue = '';

  constructor(private myAnimalsService: InsurancePackagesService, private fb: FormBuilder ) {
    this.petplans = myAnimalsService.getAnimals();
    console.log(this.petplans);
  }

  ngOnInit() {
    }
  }


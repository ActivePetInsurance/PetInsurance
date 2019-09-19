import { Component } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { IPetPlans } from '../animals';
import { InsurancePackagesService } from '../insurance-packages.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent {
  title = 'A+ Pets';
  petplans: IPetPlans[] = [];
  animalForm: FormGroup;

  constructor(private myAnimalsService: InsurancePackagesService, private fb: FormBuilder, private router: Router ) {
    this.petplans = myAnimalsService.getAnimals();
    console.log(this.petplans);
  }

  onNavigate(petVal) {
    console.log('In navigate');
    const selected = petVal;
    console.log(selected);
    switch (selected) {
        case 'Birds':
          this.router.navigate(['/welcome/Birds']);
          break;
        case 'Rodents':
            this.router.navigate(['/welcome/Rodents']);
            break;
        case 'Reptiles':
            this.router.navigate(['/welcome/Reptiles']);
            break;
  }
}
}

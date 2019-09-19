import { Component } from '@angular/core';
import { IPetPlans } from './animals';
import { FormGroup, FormBuilder } from '@angular/forms';
import { InsurancePackagesService } from './insurance-packages.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
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
          this.router.navigate(['/Birds']);
          break;
        case 'Rodents':
            this.router.navigate(['/Rodents']);
            break;
        case 'Reptiles':
            this.router.navigate(['/Reptiles']);
            break;
  }
}
}

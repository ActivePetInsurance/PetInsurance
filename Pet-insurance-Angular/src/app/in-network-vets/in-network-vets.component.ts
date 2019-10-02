import { Component, OnInit } from '@angular/core';
import { VetsinNetwork } from './VetsInNetwork';
import { InNetworkVetsService } from '../in-network-vets.service';
import { FormGroup, FormControl } from '@angular/forms';
import { templateJitUrl } from '@angular/compiler';

@Component({
  selector: 'app-in-network-vets',
  templateUrl: './in-network-vets.component.html',
  styleUrls: ['./in-network-vets.component.css']
})
export class InNetworkVetsComponent implements OnInit {



constructor(private dbvets: InNetworkVetsService) {
  this.dbvets.getVets().subscribe(
    data => {
      console.log(data);
      this.vets1 = data;
      console.log(this.vets1);
    }
  );

}

  searchZip = new FormGroup({
    searchZipcode: new FormControl('')
  });


  // vetlist

  vetsFilteredbyZipcode= new Array<any>() ;
  vets1 = new Array<any>();

filterValue: number;

show = false;

filter(zipInput): string[] {
  console.log(this.searchZip.value.searchZipcode);
  for (let i = 0; i < this.vets1.length; i++) {

    if (this.vets1[i].zipCode == this.searchZip.value.searchZipcode) {
      this.vetsFilteredbyZipcode.push(this.vets1[i]);
    }
  }
  console.log(this.vetsFilteredbyZipcode);
  this.show=true;
  return this.vetsFilteredbyZipcode;
}



ngOnInit() {
}

}

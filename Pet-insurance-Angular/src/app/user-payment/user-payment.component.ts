import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-user-payment',
  templateUrl: './user-payment.component.html',
  styleUrls: ['./user-payment.component.css']
})
export class UserPaymentComponent implements OnInit {

  creditform = new FormGroup({
    nameCC: new FormControl(''),
    billAddCC: new FormControl(''),
    cityCC: new FormControl(''),
    stateCC: new FormControl(''),
    zipcodeCC: new FormControl(''),
    cardnumCC: new FormControl(''),
    cardexpirCC: new FormControl(''),
    cvv: new FormControl('')
  });

  BankAccountform = new FormGroup({
    nameBA: new FormControl(''),
    routingNumBA: new FormControl(''),
    accountTypeBA: new FormControl(''),
    accountNumBA: new FormControl(''),
    paidAmount: new FormControl(''),
  });
  showCreditform = false;
  showBankAccountform = false;

  constructor() { }

  toggleCredit() {
    this.showCreditform = !this.showCreditform;
  }
  toggleBankAccount() {
    this.showBankAccountform = !this.showBankAccountform;

  }




  ngOnInit() {
  }

}

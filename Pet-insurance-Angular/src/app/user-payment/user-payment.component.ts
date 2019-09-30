import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { UserBAPaymentService } from '../user-bapayment-service.service';

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

  constructor(private BAService: UserBAPaymentService) {
   }

  toggleCredit() {
    this.showCreditform = !this.showCreditform;
  }
  toggleBankAccount() {
    this.showBankAccountform = !this.showBankAccountform;

  }
  credit_info() {
    console.log(this.creditform.value);

  }

  BA_info() {
    console.log(this.BankAccountform.value);
    this.BAService.upayBA(this.BankAccountform.value).subscribe(
      data => {
        this.recieptBA();
      }
    );
  }

  recieptBA(): void {
    const myReciept = document.getElementById('reciept') as HTMLElement;
    const today = new Date();
    const date = today.getFullYear() + '-' + (today.getMonth() + 1) + '-' + today.getDate();
    const time = today.getHours() + ':' + today.getMinutes() + ':' + today.getSeconds();
    const dateTime = date + ' ' + time;
    myReciept.innerHTML = ' <div class = reciept> <h1>A+ Pet Insurance</h1> <h2>reciept</h2> <h3>Date:' + dateTime + '</h3><h4>Total Amount Paid: $' + this.BankAccountform.value.paidAmount+'</h4></div>';
  }



  ngOnInit() {
  }

}

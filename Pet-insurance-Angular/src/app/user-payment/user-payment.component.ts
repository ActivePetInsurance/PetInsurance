import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { UserBAPaymentService } from '../user-bapayment-service.service';
import { UserCCpaymentServiceService } from '../user-ccpayment-service.service';
import { PolicyService } from '../policy.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-payment',
  templateUrl: './user-payment.component.html',
  styleUrls: ['./user-payment.component.css']
})
export class UserPaymentComponent implements OnInit {

  polPay;
  creditform = new FormGroup({
    nameCC: new FormControl(''),
    billAddCC: new FormControl(''),
    cityCC: new FormControl(''),
    stateCC: new FormControl(''),
    zipcodeCC: new FormControl(''),
    cardnumCC: new FormControl(''),
    cardexpirCC: new FormControl(''),
    cvv: new FormControl(''),
    paidAmount: new FormControl('')
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

  constructor(private router: Router, private BAService: UserBAPaymentService, private CCService: UserCCpaymentServiceService, private userPol: PolicyService) {
   }

  toggleCredit() {
    this.showCreditform = !this.showCreditform;
  }
  toggleBankAccount() {
    this.showBankAccountform = !this.showBankAccountform;

  }
  credit_info() {
    this.CCService.upayCC(this.creditform.value).subscribe(
      data => {
        this.recieptCC();
      }
    );

  }

  BA_info() {
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
    // tslint:disable-next-line: max-line-length
    myReciept.innerHTML = ' <div class = "reciept1" style =" border-style: solid" style = "border-width: 1px" style="border-color: rgb(11, 196, 196)"> <h2>A+ Pet Insurance</h2> <h3>Receipt</h3> <h4>Date: ' + dateTime + '</h4><h4>Total Amount Paid: $' + this.BankAccountform.value.paidAmount + '</h4></div>';
  }

  recieptCC(): void {
    const myReciept = document.getElementById('reciept') as HTMLElement;
    const today = new Date();
    const date = today.getFullYear() + '-' + (today.getMonth() + 1) + '-' + today.getDate();
    const time = today.getHours() + ':' + today.getMinutes() + ':' + today.getSeconds();
    const dateTime = date + ' ' + time;
    // tslint:disable-next-line: max-line-length
    myReciept.innerHTML = ' <div class = "reciept1" style =" border-style: solid" style = "border-width: 1px"> <h2>A+ Pet Insurance</h2> <h3>Receipt</h3> <h4>Date: ' + dateTime + '</h4><h4>Total Amount Paid: $' + this.creditform.value.paidAmount + '</h4></div>';
  }



  ngOnInit() {
    if(localStorage.getItem('owner') == null) {
      this.router.navigate(['/welcome']);
    }
    this.userPol.getPlans().subscribe(
      data => {
        this.polPay = data;
        });
  }

}

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { InsuranceCardsComponent } from './insurance-cards/insurance-cards.component';
import { RouterModule } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { InsurancePackagesService } from './insurance-packages.service';
import { AppRoutingModule } from './app-routing.model';
import { FormsModule, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { BirdCardsComponent } from './insurance-cards/bird-cards/bird-cards.component';
import { RodentCardsComponent } from './insurance-cards/rodent-cards/rodent-cards.component';
import { ReptileCardsComponent } from './insurance-cards/reptile-cards/reptile-cards.component';
import { SignupComponent } from './signup/signup.component';
import { SigninComponent } from './signin/signin.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { HomeNavbarComponent } from './home-navbar/home-navbar.component';
import { SignupNavbarComponent } from './signup-navbar/signup-navbar.component';
import { SigninNavbarComponent } from './signin-navbar/signin-navbar.component';
import { UserInfoComponent } from './user-info/user-info.component';
import { UserPetsComponent } from './user-pets/user-pets.component';
import { UserPlansComponent } from './user-plans/user-plans.component';
import { UserServiceService } from './user-service.service';
import { UserPaymentComponent } from './user-payment/user-payment.component';
import { UOwnedPetsService } from './u-owned-pets.service';
import { UserPageComponent } from './user-page/user-page.component';
import { HttpClientModule } from '@angular/common/http';
import { InNetworkVetsComponent } from './in-network-vets/in-network-vets.component';
import { InNetworkVetsNavbarComponent } from './in-network-vets-navbar/in-network-vets-navbar.component';
import { AboutusComponent } from './aboutus/aboutus.component';





@NgModule({
  declarations: [
    AppComponent,
    InsuranceCardsComponent,
    WelcomeComponent,
    BirdCardsComponent,
    RodentCardsComponent,
    ReptileCardsComponent,
    SignupComponent,
    SigninComponent,
    UserComponent,
    RegisterComponent,
    HomeNavbarComponent,
    SignupNavbarComponent,
    SigninNavbarComponent,
    UserInfoComponent,
    UserPetsComponent,
    UserPlansComponent,
    UserPaymentComponent,
    InNetworkVetsComponent,
    InNetworkVetsNavbarComponent,
    AboutusComponent


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      // order matters, put all specific before the wild cards
      {
        path: 'welcome', component: WelcomeComponent,
        children: [
          { path: '', outlet: 'hNav', component: HomeNavbarComponent },
          { path: '', component: BirdCardsComponent },
          { path: 'Birds', component: BirdCardsComponent },
          { path: 'Rodents', component: RodentCardsComponent },
          { path: 'Reptiles', component: ReptileCardsComponent }
        ]
      },
      {
        path: 'user', component: UserComponent,
        children: [
          { path: '', outlet: 'siNav', component: SigninNavbarComponent },
          { path: '', outlet: 'uInfo', component: UserInfoComponent },
          { path: '', outlet: 'uPets', component: UserPetsComponent },
          { path: '', outlet: 'uPlans', component: UserPlansComponent },
          { path: '', outlet: 'uPay', component: UserPaymentComponent }
        ]
      },
      {
        path: 'signin', component: SigninComponent,
        children: [
          { path: '', outlet: 'hNav', component: HomeNavbarComponent },
        ]
      },
      {
        path: 'signup', component: SignupComponent,
        children: [
          { path: '', outlet: 'suNav', component: SignupNavbarComponent },
        ]
      },
      {
        path: 'register', component: RegisterComponent,
        children: [
          { path: '', outlet: 'suNav', component: SignupNavbarComponent },
        ]
      },

      {
        path: 'inNetworkVets', component: InNetworkVetsComponent,
        children: [
          { path: '', outlet: 'invNav', component: InNetworkVetsNavbarComponent }
        ]
      },
      {
        path: 'aboutUs', component: AboutusComponent,
        children: [
          { path: '', outlet: 'hNav', component: HomeNavbarComponent }
        ]
      },

      { path: 'signin', component: SigninComponent },
      { path: 'signup', component: SignupComponent },
      { path: 'register', component: RegisterComponent },
      { path: 'inNetworkVets', component: InNetworkVetsComponent },
      { path: '', redirectTo: 'welcome', pathMatch: 'full' },
      { path: '**', redirectTo: 'welcome', pathMatch: 'full' },

    ])
  ],
  providers: [InsurancePackagesService, UserServiceService, UOwnedPetsService],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { InsuranceCardsComponent } from './insurance-cards/insurance-cards.component';
import { RouterModule } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { InsurancePackagesService } from './insurance-packages.service';
import { AppRoutingModule } from './app-routing.model';
import { FormsModule, FormGroup, ReactiveFormsModule} from '@angular/forms';
import { BirdCardsComponent } from './insurance-cards/bird-cards/bird-cards.component';
import { RodentCardsComponent } from './insurance-cards/rodent-cards/rodent-cards.component';
import { ReptileCardsComponent } from './insurance-cards/reptile-cards/reptile-cards.component';
import { SignupComponent } from './signup/signup.component';
import { SigninComponent } from './signin/signin.component';
import { UserPageComponent } from './user-page/user-page.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';



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
    UserPageComponent,
    UserComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      // order matters, put all specific before the wild cards
      {path: 'welcome', component: WelcomeComponent,
        children : [
          { path: '', component: BirdCardsComponent },
          {path: 'Birds', component: BirdCardsComponent},
          {path: 'Rodents', component: RodentCardsComponent},
          {path: 'Reptiles', component: ReptileCardsComponent}
        ]
    },
      {path: 'signin', component: SigninComponent},
      {path: 'signup', component: SignupComponent},
      {path: 'register', component: RegisterComponent},
      {path: '', redirectTo: 'welcome', pathMatch: 'full'},
      {path: '**', redirectTo: 'welcome', pathMatch: 'full'}
     ])
  ],
  providers: [InsurancePackagesService],
  bootstrap: [AppComponent]
})
export class AppModule { }

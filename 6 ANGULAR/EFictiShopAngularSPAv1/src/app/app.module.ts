import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ListEmpComponent } from './list-emp/list-emp.component';
import {HttpClientModule} from '@angular/common/http';
import { AddEmpComponent } from './add-emp/add-emp.component'
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from 'src/app/app-routing.module';
import { LoginComponent } from './login/login.component';
import { AddEmpTempDrivenComponent } from './add-emp-temp-driven/add-emp-temp-driven.component';

@NgModule({
  declarations: [
    AppComponent,
    ListEmpComponent,
    AddEmpComponent,
    LoginComponent,
    AddEmpTempDrivenComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    // reactive forms
    ReactiveFormsModule,
    // template driven forms
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

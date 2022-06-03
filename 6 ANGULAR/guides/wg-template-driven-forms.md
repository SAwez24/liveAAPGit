:beginner: _**Template Driven Forms**_  

:one: _cre comp_  
```sh
ng g c add-emp-temp-driven
```

:two: _add-emp-temp-driven.html_  
```html
<br>
<div class="container">
<h4>Add Employee Details Form [Template Driven]</h4>
<br>
<!-- eliminate formGroup property -->
<!-- <form [formGroup]="addEmpForm"> -->
    <!-- add local reference -->
<form #addEmpForm ="ngForm" (ngSubmit)="onSubmit(addEmpForm.value)">
<br>
    <div style="width:250px" class="alert alert-danger" *ngIf="firstName.touched && !firstName.valid">
        <div *ngIf="firstName.errors && firstName.errors['required']">First name cannot be blank</div>
        <div *ngIf="firstName.errors && firstName.errors['minlength']">First name cannot be less than 3 chars</div>
        <div *ngIf="firstName.errors && firstName.errors['maxlength']">First name cannot be less greater tha 7 chars</div>
    </div>

    <!-- Employee Id :  -->
    <!-- <input type="hidden" formControlName="id" ><br><br> -->
    <!-- <input type="hidden" formControlName="id"> -->
    <!-- <br><br> -->
    Name : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" ngModel #firstName="ngModel" required minlength="3" maxlength="7" name="firstName"><br><br>
    Salary : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" ngModel #salary="ngModel" name="salary"><br><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <button class="btn btn-success" type="submit" [class.disabled]="!addEmpForm.valid">Save</button>
    <br>

</form>
</div>
```

:three: _add-emp-temp-driven.ts_  
```ts
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-emp-temp-driven',
  templateUrl: './add-emp-temp-driven.component.html',
  styleUrls: ['./add-emp-temp-driven.component.css']
})

export class AddEmpTempDrivenComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {

    }
 onSubmit(addEmpForm : any) {
  console.log(addEmpForm)
  var firstName = addEmpForm.firstName;
  var salary = addEmpForm.salary;
  console.log(firstName);
  console.log(salary)
 }
}
```
:four: _app-routing.module.ts_  
```ts
import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AddEmpTempDrivenComponent } from "./add-emp-temp-driven/add-emp-temp-driven.component";
import { AddEmpComponent } from "./add-emp/add-emp.component";
import { ListEmpComponent } from "./list-emp/list-emp.component";
import { LoginComponent } from "./login/login.component";
import { AuthGuardService } from "./service/auth-guard.service";

export const routes: Routes = [
    { path: '', component: LoginComponent },
    { path: 'login', component: LoginComponent },
    { path: 'list-emp', component: ListEmpComponent, canActivate: [AuthGuardService] },
    { path: 'add-emp', component: AddEmpComponent, canActivate: [AuthGuardService]  },
    { path: 'add-emp-temp-driven', component: AddEmpTempDrivenComponent, canActivate: [AuthGuardService]  },
    { path: '**', component: LoginComponent },
]
@NgModule({
    imports: [CommonModule, RouterModule.forRoot(routes)],
    exports: [RouterModule],
    declarations: []
})
export class AppRoutingModule {
}

```
:five: _app.module.ts_
```ts
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

```
  


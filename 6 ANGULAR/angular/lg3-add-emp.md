:beginner: _**AddEmpComponent**_  
:zero: _tsconfig.json_  
```json
   "strict": false,
```

:one: _create comp_  
```ts
$ ng generate component add-emp
CREATE src/app/add-emp/add-emp.component.html (22 bytes)
CREATE src/app/add-emp/add-emp.component.spec.ts (627 bytes)
CREATE src/app/add-emp/add-emp.component.ts (278 bytes)
CREATE src/app/add-emp/add-emp.component.css (0 bytes)
UPDATE src/app/app.module.ts (476 bytes)

```
:two: _add ReactiveFormsModule_  
```ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { AddEmpComponent } from './add-emp/add-emp.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AddEmpComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
```

:three:  _add-emp.component.ts_  
```ts
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {EmployeeService} from '../service/employee.service' 
  
  @Component({
  selector: 'app-add-emp',
  templateUrl: './add-emp.component.html',
  styleUrls: ['./add-emp.component.css']
})
export class AddEmpComponent implements OnInit {
  addEmpForm: FormGroup;

  constructor(private formBuilder : FormBuilder, private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.addEmpForm = this.formBuilder.group ( {
      id: [],
      // name: ['Sam',Validators.required, Validators.maxLength(5)],
      // salary : ['1000', Validators.required]
      name :[],
      salary : [],
    })
  }
 onSubmit() {
   console.log("Employee details sent to the server...");
  this.employeeService
  .createEmployee(this.addEmpForm.value)
  .subscribe((data)=>{console.log("Data Saved")})
 }
}


```
:four: _add-emp.component.html_  
```html
<br>
<h4>Add Employee Details Form</h4>
<br>
<form [formGroup]="addEmpForm">
    <!-- Employee Id :  -->
    <!-- <input type="hidden" formControlName="id" ><br><br> -->
    <input type="hidden" formControlName="id"><br><br>
    Name : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" formControlName="name"><br><br>
    Salary : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" formControlName="salary"><br><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <button class="btn btn-success" (click)="onSubmit()">Save</button>
</form>

```
:five: _app.component.html_  

```html
<app-add-emp></app-add-emp>
```

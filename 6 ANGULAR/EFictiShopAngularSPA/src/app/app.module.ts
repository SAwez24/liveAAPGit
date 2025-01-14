import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FormComponent } from './form/form.component';
// import { FormComponent as EmployeeFormComponent } from './employee/form/form.component';
import { FormCopyComponent } from './form-copy/form-copy.component';
import { ListEmpComponent } from './list-emp/list-emp.component';
import {HttpClientModule} from '@angular/common/http'


@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    // EmployeeFormComponent,
    FormCopyComponent,
    ListEmpComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

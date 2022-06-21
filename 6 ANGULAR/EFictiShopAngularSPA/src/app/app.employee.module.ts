import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';

import { FormCopyComponent } from './form-copy/form-copy.component';
import { ListEmpComponent } from './list-emp/list-emp.component';
import {HttpClientModule} from '@angular/common/http'
import { FormComponent } from './employee/form/form.component';


@NgModule({
  declarations: [
    AppComponent,
   FormComponent,
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

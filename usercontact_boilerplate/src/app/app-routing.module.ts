import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ContactComponent } from './contact/contact.component';
import { SearchComponent } from './search/search.component';

// Define paths for routing between contact form and listing view

// /contact -> route to Contact component

const routes: Routes = [
  {path:"home",component:ContactComponent},
  // /listContatct -> route to search component
  {path:"search",component:SearchComponent},
  // Empty path ('') should route to Contact Component
  {path:"",redirectTo: 'home', pathMatch: 'full'}  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

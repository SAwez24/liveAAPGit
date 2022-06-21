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
    //  { path: 'list-emp', component: ListEmpComponent},
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


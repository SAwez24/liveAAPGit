import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginFormGroup : FormGroup;
  constructor(private formBuilder : FormBuilder, private router : Router) { }

  ngOnInit(): void {
    this.loginFormGroup =  this.formBuilder.group ( {
      // loginId : [''],
      // password : []
      loginId : ["teddy"],
      password : ["bear"]
    });
  }
 onSubmit() {
   console.log("logging.")
   console.log(this.loginFormGroup.value)
   console.log(this.loginFormGroup.controls['loginId'].value);
   console.log(this.loginFormGroup.controls['password'].value);

   const loginId : string = this.loginFormGroup.controls['loginId'].value;
   const password : string = this.loginFormGroup.controls['password'].value;

   if(loginId == 'teddy' && password == 'bear') {
   this.router.navigate(['list-emp'])
   sessionStorage.setItem('loggedIn','yes')
   }
   else
   {
    this.router.navigate(['login'])
    sessionStorage.setItem('loggedIn','no')
   }
 }
}

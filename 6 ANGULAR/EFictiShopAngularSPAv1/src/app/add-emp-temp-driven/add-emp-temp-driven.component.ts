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
import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/model/employee.model';
import { EmployeeService } from 'src/service/employee.service';
//@Override / annotion
// @Component / decorator
@Component({
  selector: 'app-list-emp',
  templateUrl: './list-emp.component.html',
  styleUrls: ['./list-emp.component.css']
})
export class ListEmpComponent implements OnInit {
 employees?: Employee[];
  //dependency injection 
  constructor(private employeeService: EmployeeService) {
    console.log("cons")
  }

  ngOnInit(): void {
    console.log("init")
    this.employeeService.getEmployees().subscribe((employees) => { 
      this.employees = employees
      console.log(employees)
     });
  }
}

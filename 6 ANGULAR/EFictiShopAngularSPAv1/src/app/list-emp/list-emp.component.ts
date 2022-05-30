import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee.model';
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-list-emp',
  templateUrl: './list-emp.component.html',
  styleUrls: ['./list-emp.component.css']
})
export class ListEmpComponent implements OnInit {

  employees?: Employee[];

  constructor(private employeeService: EmployeeService) {
  }

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe(
      (data => {
        this.employees = data;
        console.log("DATA : " + data)
      })
    );
  }

  deleteEmp(employee: Employee): void {
    this.employeeService.deleteEmployee(employee.id).subscribe(
      (empDel) => this.employees.filter((empDel) => empDel != employee)
    )
  }
}
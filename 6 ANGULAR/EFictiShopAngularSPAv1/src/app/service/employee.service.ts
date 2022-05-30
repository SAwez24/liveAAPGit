import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import { Employee } from '../model/employee.model';

// service shared by entire app
@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
   baseUrl : string = 'http://localhost:3000/employees'
  // Performs HTTP requests.
  constructor(private http: HttpClient) {
    
  }
  // returns Observable
  getEmployees() {
    // get : fetch data from the server
     return this.http.get<Employee[]>(this.baseUrl);
  }

  // add employee
  createEmployee(employee: Employee) {
  // post : send data to the server
  return this.http.post(this.baseUrl,employee)
  }

  //delete employee
  deleteEmployee(id:number) {
    return this.http.delete<Employee>(this.baseUrl+'/'+id);
  }
}
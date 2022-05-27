import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Employee } from "src/model/employee.model";

@Injectable({
   providedIn:'root'
})
export class EmployeeService {
   // url for REST API
   baseURL: string = 'http://localhost:3000/employees';
   // dependency injection / HttpClient instance created
   constructor(private httpClient: HttpClient) {
   }
   getEmployees() {
      // get : fetch data from server
      return this.httpClient.get<Employee[]>(this.baseURL)
   }
}
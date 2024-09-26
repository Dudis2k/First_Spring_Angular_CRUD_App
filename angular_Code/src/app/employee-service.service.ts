import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';
import { EmpPay } from './emp-pay';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {

  private employee: Employee;
  private empsal:EmpPay;

  private baseURL = "http://localhost:8080/api";
  constructor(private http: HttpClient) { }

  // getEmployeeList(): Observable<Employee[]>{
  //   return this.httpclient.get<Employee[]>('${this.baseURL}');
  // }
  getEmployeesList(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.baseURL}/allemployees`);
  }
  createemp(employee: Employee): Observable<any>{
    return this.http.post(`${this.baseURL}/add`, employee);
  }
  removeemp(id:number): Observable<any>{
    return this.http.delete(`${this.baseURL}/delete_emp/${id}`);
  }
  getEmppay(): Observable<EmpPay[]>{
    return this.http.get<EmpPay[]>(`${this.baseURL}/salary`);
  }
  searchEmp(): Observable<Employee>{
    return this.http.get<Employee>('${this.baseURL}/search/${id}');
  }
}

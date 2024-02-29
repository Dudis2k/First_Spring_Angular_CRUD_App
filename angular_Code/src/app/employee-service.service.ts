import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {

  private employee: Employee

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
}

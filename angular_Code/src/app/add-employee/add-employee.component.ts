import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeServiceService } from '../employee-service.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrl: './add-employee.component.scss'
})
export class AddEmployeeComponent {
  employee: Employee = new Employee();
  constructor(private employeeService: EmployeeServiceService){

  }

  ngOnInit(): void{}

  saveEmployee(){
    this.employeeService.createemp(this.employee).subscribe(data =>{
      console.log(data);
    },
    error => console.log(this.employee));
  }
  onSubmit(){
    console.log(this.employee);
    this.saveEmployee();
  }
}

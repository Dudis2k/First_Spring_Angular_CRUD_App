import { Component } from '@angular/core';
import { EmpPay } from '../emp-pay';
import { EmployeeServiceService } from '../employee-service.service';

@Component({
  selector: 'app-employee-salary',
  templateUrl: './employee-salary.component.html',
  styleUrl: './employee-salary.component.scss'
})
export class EmployeeSalaryComponent {
  emp_pays : EmpPay[];
  constructor(private empService:EmployeeServiceService){
  }
  ngOnInit(){
    this.getemppayfn();

  }
  public getemppayfn(){
    this.empService.getEmppay().subscribe(data=>{
      this.emp_pays=data;
    })
  }
}

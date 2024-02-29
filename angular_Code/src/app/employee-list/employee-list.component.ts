import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeServiceService } from '../employee-service.service';
@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrl: './employee-list.component.scss'
})
export class EmployeeListComponent {
  employees:Employee[];
  employee: Employee = new Employee();
  constructor(private empService:EmployeeServiceService){
    // this.employees=[
    //   {
    //     "id":1,
    //     "name":"Sid",
    //     "mail":"Sid@gmail.com"
    //   },
    //   {
    //     "id":2,
    //     "name":"Gregor",
    //     "mail":"Gregor@gmail.com"
    //   }
    // ];
  }
  ngOnInit():void{
    this.getEmployees();
    console.log(this.employees);
  }
  private getEmployees(){
    this.empService.getEmployeesList().subscribe(data=>{
      this.employees=data;
    })
  }
  removeemployee(id:number){
    this.empService.removeemp(id).subscribe(data=>{
      console.log("Success");
          this.getEmployees();
        },
        error => console.log(error));
    }
  }

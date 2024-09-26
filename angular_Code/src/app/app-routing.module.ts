import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeeSalaryComponent } from './employee-salary/employee-salary.component';
import { LoginmoduleComponent } from './loginmodule/loginmodule.component';

const routes: Routes = [
  //{path:'',redirectTo:'employees',pathMatch:'full'},
  {path:'',redirectTo:'login',pathMatch:'full'},
  {path:'login',component:LoginmoduleComponent},
  {path:'employees',component:EmployeeListComponent},
  {path:'add-emp', component:AddEmployeeComponent},
  {path:'emp_sal', component:EmployeeSalaryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { EmployeeServiceService } from './employee-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  
constructor(private empservice: EmployeeServiceService){}
  title = 'First-Successul CRUD application';
  // int search_id;
search_id(){
  this.empservice.searchEmp();
}
}

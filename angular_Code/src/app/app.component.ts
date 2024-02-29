import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'First-Successul CRUD application';
  // rowData:any[]=[
  //   {make:'Nissan', model: 'Micra', price:10000},
  //   {make:'Honda', model: 'City', price:22000},
  //   {make:'Tata', model: 'Tiago', price:11000}
  // ]
  // public rowD$!: Observable<any[]>;

  // colDefs:any[]=[
  //   {field:'make'},
  //   {field:'model'},
  //   {field:'price'}
  // ]

;
  // gridOptions.setRowData([
  //   { make: 'mahindra', model: 'xuv', price: 11000 }
  // ]);

  // constructor(private http:HttpClient){}

  // ngOnInit(){
  //   this.rowD$ = this.http.get<any[]>('http://localhost:8080/api/allemployees');
  // }
  // let grid:any[]= agGrid.simpleHttpRequest({url: 'https://www.ag-grid.com/example-assets/row-data.json'})
  // .then(data => {
  //     gridOptions.api.setRowData(data);
  // });

}

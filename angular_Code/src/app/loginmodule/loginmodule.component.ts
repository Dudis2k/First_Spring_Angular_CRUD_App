import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginmodule',
  templateUrl: './loginmodule.component.html',
  styleUrl: './loginmodule.component.scss'
})
export class LoginmoduleComponent {

  constructor(private router:Router){

  }
  uname:String;
  pwd:String;
  
  onBuy() {
    // window.alert('You just bought ${this.selectedProduct?.name}!');
    if(this.uname == 'sid'&&this.pwd=="sid"){
      console.log("Login successful");
      this.router.navigate(['/employees']);
    }
    }
}

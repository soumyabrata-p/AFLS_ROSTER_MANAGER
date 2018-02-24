import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import { LoginService } from "../login.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  hide;username;password;
  constructor(private router: Router, private loginService : LoginService) {}

  ngOnInit() {
    this.hide = true;
  }

  login(){
    if(true){
      this.router.navigate(['home']);
      this.loginService.login(this.username,this.password);
    }
    
  }

}

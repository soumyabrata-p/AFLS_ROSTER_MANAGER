import { Injectable } from '@angular/core';

@Injectable()
export class LoginService {

  constructor() { }

  login(username : String, password : String) : void {
    console.log(username + '\n' + password);
  }
  logout(){
    console.log("Logged out successfully");
  }

}

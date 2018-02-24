import { NgModule } from '@angular/core';
import { RouterModule , Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ResourceManagementComponent } from './home/resource-management/resource-management.component';

const routes: Routes = [
	{ path: '', redirectTo : 'login', pathMatch : 'full'},
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent,
    children : [
      { path: '', redirectTo : 'resourceManagement', pathMatch:'full'},
      { path: 'resourceManagement', component : ResourceManagementComponent}
    ]
  },
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }

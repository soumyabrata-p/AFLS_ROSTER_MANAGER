import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AppRoutingModule } from './/app-routing.module';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { 
  MatMenuModule,
  MatInputModule, 
  MatButtonModule, 
  MatSelectModule, 
  MatIconModule,
  MatToolbarModule, 
  MatFormField,
  MatCardModule,
  MatExpansionModule
 } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ResourceManagementComponent } from './home/resource-management/resource-management.component';
import { LoginService } from './login.service';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    MenuComponent,
    ResourceManagementComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatInputModule, 
    MatButtonModule,
    MatSelectModule,
    MatIconModule,
    MatMenuModule,
    MatToolbarModule,
    MatCardModule,
    MatExpansionModule
  ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }

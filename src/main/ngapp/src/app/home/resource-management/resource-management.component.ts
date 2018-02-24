import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-resource-management',
  templateUrl: './resource-management.component.html',
  styleUrls: ['./resource-management.component.css']
})
export class ResourceManagementComponent implements OnInit {
  badges;skills;panelOpenState;
  constructor() { }

  ngOnInit() {
    this.badges = [
      {value: 'air', viewValue: 'Air'},
      {value: 'ocean', viewValue: 'Ocean'}
    ];
    this.skills = [
      {value: 'java', viewValue: 'JAVA'},
      {value: 'devops', viewValue: 'DevOps'},
      {value: 'angularjs', viewValue: 'Angular JS'},
      {value: 'ux', viewValue: 'UX'}
    ];
  }

}

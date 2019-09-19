import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home-navbar',
  templateUrl: './home-navbar.component.html',
  styleUrls: ['./home-navbar.component.css']
})
export class HomeNavbarComponent implements OnInit {
  title = 'A+ Pets';

  ngOnInit(): void {
  }

  constructor(route: ActivatedRoute) {

    route.params.subscribe(params => console.log("side menu id parameter",params['id']));

}
}
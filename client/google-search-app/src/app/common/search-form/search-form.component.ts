import {Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'search-form',
  templateUrl: './search-form.component.html',
  styleUrls: ['./search-form.component.scss']
})
export class SearchFormComponent implements OnInit {

  model: any = {};

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  search() {
    console.log(this.model);
    this.router.navigate(['/search'],{ queryParams: { query: this.model.query } });
  }
}

import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'search-form',
  templateUrl: './search-form.component.html',
  styleUrls: ['./search-form.component.scss']
})
export class SearchFormComponent implements OnInit {
  @Input()
  formLayout: string = '';
  @Input()
  searchString: string = '';
  model: any = {};

  constructor(private router: Router) {}

  ngOnInit(): void {
    this.model = {
      query: this.searchString
    };
  }

  search() {
    console.log(this.model);
    this.router.navigate(['/search'], {
      queryParams: { query: this.model.query }
    });
  }
}

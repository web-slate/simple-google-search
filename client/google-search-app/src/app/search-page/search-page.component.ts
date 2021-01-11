import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'search-page',
  templateUrl: './search-page.component.html',
  styleUrls: ['./search-page.component.scss']
})
export class SearchPageComponent implements OnInit {

  constructor(private router: ActivatedRoute) {

  }

  ngOnInit(): void {
    this.router.queryParamMap.subscribe(d => {
      console.log(d.get('query'));
    });
    //FIXME: To call REST API through Services (get)
  }

}

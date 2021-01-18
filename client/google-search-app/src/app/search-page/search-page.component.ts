import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SearchService } from '../services/search.service';
import { SearchResults } from '../model/search-results';

@Component({
  selector: 'search-page',
  templateUrl: './search-page.component.html',
  styleUrls: ['./search-page.component.scss']
})
export class SearchPageComponent implements OnInit {
  private query_string = '';
  private query_subscriber :any;
  search_results = <SearchResults>{};
  resultLayout:string = 'resultLayout';
  constructor(private router: ActivatedRoute, private service: SearchService) {}

  ngOnInit(): void {
    this.query_subscriber = this.router.queryParams.subscribe(params => {
      this.query_string = params['query'];
      this.search_results = this.service.getSearchResults(this.query_string);
      console.info(this.query_string, this.search_results);
    });
    //FIXME: To call REST API through Services (get)
  }

  //Important to unsubscribe
  ngOnDestroy():void{
    this.query_subscriber.unsubscribe();
  }
}

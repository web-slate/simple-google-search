import { Component, OnInit, Input } from '@angular/core';
import { Results } from '../model/results';

@Component({
  selector: 'app-search-results',
  templateUrl: './search-results.component.html',
  styleUrls: ['./search-results.component.scss']
})
export class SearchResultsComponent implements OnInit {

  @Input() 
  result:Results = {title:'',url:'',short_description:''};

  constructor() {
   }

  ngOnInit(): void {
  }

}

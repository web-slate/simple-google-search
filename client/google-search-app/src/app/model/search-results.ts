import { Results } from './results';

export class SearchResults {
  total_results: number;
  execution_time: number;
  query_string: string;
  results: Array<Results>;

  constructor(
    total_results: number,
    execution_time: number,
    query_string: string,
    results: Array<Results>
  ) {
    this.total_results = total_results;
    this.execution_time = execution_time;
    this.query_string = query_string;
    this.results = results;
  }
}

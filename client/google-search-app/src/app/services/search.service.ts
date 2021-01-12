import { Injectable } from '@angular/core';
import { SearchResults } from '../model/search-results';

@Injectable({
  providedIn: 'root'
})
export class SearchService {
  constructor() {}

  getSearchResults(query: string): SearchResults {
    // API call logic goes here
    return {
      total_results: 6,
      execution_time: 45000,
      query_string: 'facebook',
      results: [
        {
          title: 'Facebook - Log In or Sign Up',
          url: 'https://www.facebook.com/',
          short_description:
            'Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.'
        },
        {
          title: 'Facebook (@Facebook) · Twitter',
          url: 'https://twitter.com/Facebook',
          short_description: ''
        },
        {
          title: 'Facebook – Apps on Google Play',
          url:
            'https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en_IN&gl=US',
          short_description:
            'Keeping up with friends is faster and easier than ever. Share updates and photos, engage with friends and Pages, and stay connected to communities important ...'
        },
        {
          title: 'Newsroom | About Facebook',
          url: 'https://about.fb.com/news/',
          short_description:
            'View the latest news, announcements and media resources from Facebook.'
        },
        {
          title: 'About Facebook',
          url: 'https://about.fb.com/',
          short_description:
            'Facebook builds technologies that give people the power to connect with friends and family, find communities and grow businesses.'
        },
        {
          title: 'Facebook - Wikipedia',
          url: 'https://en.wikipedia.org/wiki/Facebook',
          short_description:
            'Facebook (stylized as facebook) is an American online social media and social networking service based in Menlo Park, California, and a flagship service of the ...'
        }
      ]
    };
  }
}

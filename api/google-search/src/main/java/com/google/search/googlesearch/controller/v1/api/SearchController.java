package com.google.search.googlesearch.controller.v1.api;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "v1/search")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Get search results", content = @Content(schema = @Schema(nullable = true)))
    })
    public @ResponseBody String searchResultv1(@RequestParam(defaultValue = "param") String query) {
        String response = "";

        if (query.equals("facebook")) {
            response = "{\"total_results\":6,\"execution_time\":45000,\"query_string\":\"" + query + "\",\"results\":[{\"title\":\"Facebook - Log In or Sign Up\",\"url\":\"https://www.facebook.com/\",\"short_description\":\"Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.\"},{\"title\":\"Facebook (@Facebook) · Twitter\",\"url\":\"https://twitter.com/Facebook\",\"short_description\":\"\"},{\"title\":\"Facebook – Apps on Google Play\",\"url\":\"https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en_IN&gl=US\",\"short_description\":\"Keeping up with friends is faster and easier than ever. Share updates and photos, engage with friends and Pages, and stay connected to communities important ...\"},{\"title\":\"Newsroom | About Facebook\",\"url\":\"https://about.fb.com/news/\",\"short_description\":\"View the latest news, announcements and media resources from Facebook.\"},{\"title\":\"About Facebook\",\"url\":\"https://about.fb.com/\",\"short_description\":\"Facebook builds technologies that give people the power to connect with friends and family, find communities and grow businesses.\"},{\"title\":\"Facebook - Wikipedia\",\"url\":\"https://en.wikipedia.org/wiki/Facebook\",\"short_description\":\"Facebook (stylized as facebook) is an American online social media and social networking service based in Menlo Park, California, and a flagship service of the ...\"}]}";
        } else if (query.equals("youtube")) {
            response = "{\"total_results\":6,\"execution_time\":49000,\"query_string\":\"" + query + "\",\"results\":[{\"title\":\"YouTube\",\"url\":\"https://www.youtube.com/\",\"short_description\":\"Enjoy the videos and music you love, upload original content, and share it all with friends, family, and the world on YouTube.\"},{\"title\":\"YouTube (@YouTube) · Twitter\",\"url\":\"https://twitter.com/YouTube\",\"short_description\":\"\"},{\"title\":\"YouTube – Apps on Google Playplay\",\"url\":\"https://play.google.com/store/apps/details?id=com.google.android.youtube&hl=en_IN&gl=US\",\"short_description\":\"Get the official YouTube app for Android phones and tablets. See what the world is watching -- from the hottest music videos to what's trending in gaming, ...\"},{\"title\":\"YouTube - Home | Facebook\",\"url\":\"https://www.facebook.com/youtube/\",\"short_description\":\"YouTube. 85M likes. The latest and greatest music videos, trends and channels from YouTube.\"},{\"title\":\"YouTube - Wikipedia\",\"url\":\"https://en.wikipedia.org/wiki/YouTube\",\"short_description\":\"YouTube is an American online video-sharing platform headquartered in San Bruno, California. Three former PayPal employees—Chad Hurley, Steve Chen, ...\"},{\"title\":\"YouTube Help - Google Support\",\"url\":\"https://support.google.com/youtube/?hl=en\",\"short_description\":\"How can we help you? Fix a problem. Troubleshoot problems playing videos · Troubleshoot account issues · Fix upload problems · Fix YouTube Premium ...\"}]}";
        }

        if (response == "") {
            response = "{\"total_results\":0,\"execution_time\":49000,\"query_string\":\"" + query + "\",\"results\":[]}";
        }

        return response;
    }
}

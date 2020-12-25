package com.google.search.googlesearch.controller.v1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class SearchController {
    @GetMapping(value = "v1/search")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Get search results", content = @Content(schema = @Schema(nullable = true)))
    })
    public String getSearch(@RequestParam(defaultValue = "param") String query) {
        if (query.equals("facebook")) {
            return "facebook search";
        } else if (query.equals("youtube")) {
            return "youtube search";
        }

        return "No Result for " + query;
    }
}

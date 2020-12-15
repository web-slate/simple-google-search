package com.google.search.googlesearch.controller.v1.api;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.search.googlesearch.models.SearchAutoCompleteModel;
import com.google.search.googlesearch.services.SearchAutoCompleteService;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value = "/api/v1/")
public class SearchAutoCompleteController {
	
	@Inject
	private SearchAutoCompleteModel searchAutoCompleteModel;
	
	@Inject
	private SearchAutoCompleteService searchAutoCompleteService;
	
	@GetMapping(value = "search/autocomplete", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Results Found for the Query"),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(nullable = true))),
			@ApiResponse(responseCode = "404", description = "Result Not Found for the Query", content = @Content(schema = @Schema(example = "{\n"
					+ "  \"results\": []\n" + "}"))),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(nullable = true))) })
	public ResponseEntity<SearchAutoCompleteModel> autoCompleteSearch(@RequestParam String q) {
		searchAutoCompleteModel.setResults(searchAutoCompleteService.findByKeywordUsingLoop(q));
		if (searchAutoCompleteModel.getResults().size() > 0)
			return new ResponseEntity<>(searchAutoCompleteModel, HttpStatus.FOUND);
		else
			return new ResponseEntity<>(searchAutoCompleteModel, HttpStatus.NOT_FOUND);
	}

}

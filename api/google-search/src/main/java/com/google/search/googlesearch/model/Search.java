package com.google.search.googlesearch.model;

import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import lombok.Data;
 
@Data 
@Document
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;
 
    private String keyword; 

    private String result; 

    public Search(String keyword, String result) {
        this.keyword = keyword;
        this.result = result;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getResult() {
        return result;
    }
}

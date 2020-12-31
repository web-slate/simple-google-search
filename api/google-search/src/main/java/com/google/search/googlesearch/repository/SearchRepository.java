package com.google.search.googlesearch.repository;
 
import com.google.search.googlesearch.model.Search;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends CouchbaseRepository<Search, Integer>{ 
}


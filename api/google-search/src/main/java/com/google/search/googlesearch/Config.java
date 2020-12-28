package com.google.search.googlesearch;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

public class Config extends AbstractCouchbaseConfiguration {
    
    @Override
    public String getConnectionString() {
        return "couchbase://127.0.0.1";
    }

    @Override
    public String getUserName() {
        return "Administrator";
    }

    @Override
    public String getPassword() {
        return "Administrator";
    }

    @Override
    public String getBucketName() {
        return "google-search";
    }
}
package com.google.search.googlesearch;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class Config extends AbstractCouchbaseConfiguration {
    
    @Value("${couchbase.connection-string}")
    public String connectionString;

    @Value("${couchbase.user-name}")
    private String userName;

    @Value("${couchbase.password}")
    private String password;

    @Value("${couchbase.bucket-name}")
    private String bucketName;

    @Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    } 

    @Override
    public String getBucketName() {
        return bucketName;
    }
}
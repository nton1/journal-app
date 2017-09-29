package com.journal.app.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by User on 28/09/2017.
 */
@Configuration
@Profile("customuserdetails")
public class MongoConfiguration {
    @Bean
    public MongoClient createConnection(){
        //You should put your mongodb ip here
        return new MongoClient("localhost:27017");
    }
}

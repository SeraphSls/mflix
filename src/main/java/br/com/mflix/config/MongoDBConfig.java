package br.com.mflix.config;


import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;

import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Configuration
public class MongoDBConfig {


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MongoClient getMongoClient(@Value("${spring.mongodb.uri}") String connectionString){

        ConnectionString connection = new ConnectionString(connectionString);

        return MongoClients.create(connection);
    }


}

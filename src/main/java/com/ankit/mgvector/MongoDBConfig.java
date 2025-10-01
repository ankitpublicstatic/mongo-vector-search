package com.ankit.mgvector;

import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import com.mongodb.reactivestreams.client.MongoDatabase;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
@Configuration
public class MongoDBConfig {

  @Value("${spring.data.mongodb.uri}")
  private String MONGDB_URI;
  @Value("${spring.data.mongodb.database}")
  private String MONGO_DB;

  @Bean
  public MongoClient mongoClient() {
    CodecRegistry pojoCodecRegistry =
        CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    MongoClientSettings settings =
        MongoClientSettings.builder().applyConnectionString(new ConnectionString(MONGDB_URI))
            .codecRegistry(pojoCodecRegistry).build();
    return MongoClients.create(settings);
  }

  @Bean
  public MongoDatabase mongoDatabase(MongoClient mongoClient) {
    return mongoClient.getDatabase(MONGO_DB);
  }

}

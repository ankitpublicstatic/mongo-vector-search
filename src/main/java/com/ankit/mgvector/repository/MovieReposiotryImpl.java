package com.ankit.mgvector.repository;

import static com.mongodb.client.model.Aggregates.vectorSearch;
import static com.mongodb.client.model.search.SearchPath.fieldPath;
import static java.util.Arrays.asList;
import java.util.List;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import com.ankit.mgvector.models.Movie;
import com.mongodb.reactivestreams.client.MongoCollection;
import com.mongodb.reactivestreams.client.MongoDatabase;
import reactor.core.publisher.Flux;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
public class MovieReposiotryImpl implements MovieRepository {

  private final MongoDatabase mongoDatabase;

  @Autowired
  public MovieReposiotryImpl(MongoDatabase mongoDatabase) {
    super();
    this.mongoDatabase = mongoDatabase;
  }

  private MongoCollection<Movie> getMovieCollection() {
    return mongoDatabase.getCollection("embedded_movies", Movie.class);
  }

  @Override
  public Flux<Movie> findMoviesByVector(List<Double> embedding) {
    String indexName = "vector_index";
    int numCandidate = 100;
    int limit = 5;

    List<Bson> pipeline = asList(
        vectorSearch(fieldPath("plot_embedding"), embedding, indexName, numCandidate, limit));

    return Flux.from(getMovieCollection().aggregate(pipeline, Movie.class));
  }

}

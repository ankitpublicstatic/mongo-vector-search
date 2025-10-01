package com.ankit.mgvector.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ankit.mgvector.models.Movie;
import com.ankit.mgvector.repository.MovieRepository;
import reactor.core.publisher.Mono;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
@Service
public class MovieService {
  private final MovieRepository movieRepository;
  private XAIService embedder;

  @Autowired
  public MovieService(MovieRepository movieRepository, XAIService embedder) {
    super();
    this.movieRepository = movieRepository;
    this.embedder = embedder;
  }

  public Mono<List<Movie>> getMoviesVectorSearch(String plotDescription) {
    return embedder.ceateEmbedding(plotDescription).flatMapMany(movieRepository::findMoviesByVector)
        .collectList();
  }
}

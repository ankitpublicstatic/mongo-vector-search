package com.ankit.mgvector.repository;

import java.util.List;
import com.ankit.mgvector.models.Movie;
import reactor.core.publisher.Flux;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
public interface MovieRepository {
  Flux<Movie> findMoviesByVector(List<Double> embedding);
}

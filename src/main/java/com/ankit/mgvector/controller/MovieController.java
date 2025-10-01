package com.ankit.mgvector.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ankit.mgvector.models.Movie;
import com.ankit.mgvector.services.MovieService;
import reactor.core.publisher.Mono;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
@RestController
public class MovieController {
  private MovieService movieService;

  @Autowired
  public MovieController(MovieService movieService) {
    super();
    this.movieService = movieService;
  }

  @GetMapping("/movies/vector-search")
  public Mono<List<Movie>> performVectorSearch(@RequestParam String plotDescription) {
    return movieService.getMoviesVectorSearch(plotDescription);
  }
}

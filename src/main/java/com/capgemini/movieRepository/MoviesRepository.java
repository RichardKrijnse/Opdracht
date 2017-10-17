package com.capgemini.movieRepository;
import com.capgemini.movies.Movie;
import org.springframework.data.repository.CrudRepository;


public interface MoviesRepository extends CrudRepository<Movie, Long> {

}

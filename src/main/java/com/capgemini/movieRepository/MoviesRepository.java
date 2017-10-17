package com.capgemini.movieRepository;
import com.capgemini.movies.Movies;
import org.springframework.data.repository.CrudRepository;


public interface MoviesRepository extends CrudRepository<Movies, Long> {

}

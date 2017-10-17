package com.capgemini.controller;
import com.capgemini.movieRepository.MovieRepository;
import com.capgemini.movies.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    //controller
    @RestController
    @RequestMapping("/api/movie/")
    public class MovieController {

        //auto innitialize de repository
        @Autowired
        MovieRepository movieRepository;

        //tonen van de ingevoerde films
        @RequestMapping(value="",method = RequestMethod.GET)
        public Iterable<Movie> getAll() {
            return movieRepository.findAll();
        }

        //toevoegen van films
        @RequestMapping(value="", method=RequestMethod.POST)
        public void add(@RequestBody Movie movie) {
            movieRepository.save(movie);
        }

    }



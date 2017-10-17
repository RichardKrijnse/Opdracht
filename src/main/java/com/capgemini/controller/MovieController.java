package com.capgemini.controller;
import com.capgemini.movieRepository.MoviesRepository;
import com.capgemini.movieRepository.MoviesRepository;
import com.capgemini.movies.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/")
    public class MovieController {

        @Autowired
        MoviesRepository moviesRepository;

        @RequestMapping(value="",method = RequestMethod.GET)
        public Iterable<Movies> getAll() {
            return moviesRepository.findAll();
        }

        @RequestMapping(value="", method=RequestMethod.POST)
        public void add(@RequestBody Movies movies) {
            moviesRepository.save(movies);
        }

        @RequestMapping(value="{id}/", method= RequestMethod.DELETE)
        public void del(@PathVariable long id) {
            moviesRepository.delete(id);
        }

        @RequestMapping(value="{id}/", method= RequestMethod.GET)
        public Movies get(@PathVariable long id) {
            return moviesRepository.findOne(id);
        }

        @RequestMapping(value="", method=RequestMethod.PUT)
        public void save(@RequestBody Movies movies) {
            moviesRepository.save(movies);
        }

    }



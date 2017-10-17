package com.capgemini.movies;

import javax.persistence.Entity;
import javax.persistence.Id;

//POJO
@Entity
public class Movie {
    @Id
    private String movieName;
    private boolean movieSeen;

    // lege constructor
    public Movie() {}

    //getters
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    //setters
    public boolean isMovieSeen() {
        return movieSeen;
    }

    public void setMovieSeen(boolean movieSeen) {
        this.movieSeen = movieSeen;
    }
}

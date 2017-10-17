package com.capgemini.movies;

public class Movie {
    private String movieName;
    private boolean movieSeen;

    public Movie() {}

    public Movie(String movieName, boolean movieSeen) {
        this.movieName = movieName;
        this.movieSeen = movieSeen;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public boolean isMovieSeen() {
        return movieSeen;
    }

    public void setMovieSeen(boolean movieSeen) {
        this.movieSeen = movieSeen;
    }
}

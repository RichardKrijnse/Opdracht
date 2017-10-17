package com.capgemini.movies;

public class Movies {
    private String movieName;
    private boolean movieSeen;

    public Movies() {}

    public Movies(String movieName, boolean movieSeen) {
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

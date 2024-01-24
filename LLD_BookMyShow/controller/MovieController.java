package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Movie;
import enums.City;

public class MovieController {

    Map<City,List<Movie>> cityVsMovieMap;
    List<Movie> allMovies;

    public MovieController() {
        cityVsMovieMap = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city) {
        allMovies.add(movie);

        List<Movie> movies = cityVsMovieMap.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovieMap.put(city, movies);
    }

    public Movie getMovieByName(String movieName) {
        for(Movie movie: allMovies) {
            if(movie.getMovieName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMoviesByCity(City city) {
        return cityVsMovieMap.get(city);
    }
    
}

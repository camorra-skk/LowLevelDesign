package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Movie;
import domain.Show;
import domain.Theatre;
import enums.City;

public class TheatreController {

    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatre;

    public TheatreController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre, City city) {
        List<Theatre> cityTheatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        cityTheatres.add(theatre);
        cityVsTheatre.put(city, cityTheatres);

        allTheatre.add(theatre);
    }

    public Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {
        List<Theatre> cityTheatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        if(cityTheatres.isEmpty()) return new HashMap<>();

        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();
        for(Theatre theatre: cityTheatres) {
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show: shows) {
                if(show.getMovie().equals(movie)) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }

        }
        return theatreVsShows;
    }
    
}

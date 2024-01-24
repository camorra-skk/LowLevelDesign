package domain;

import java.util.ArrayList;
import java.util.List;

import enums.City;

public class Theatre {

    private String theatreId;
    private City city;
    private String address;
    private List<Screen> screenIds = new ArrayList<>();
    private List<Show> shows = new ArrayList<>();

    public String getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Screen> getScreenIds() {
        return screenIds;
    }

    public void setScreenIds(List<Screen> screenIds) {
        this.screenIds = screenIds;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}

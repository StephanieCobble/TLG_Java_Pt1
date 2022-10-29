package net.flix;

import it.snip.Scissors;

class Movie {
    private String title;
    private  Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre = Genre.ANIMATION;

    // constructors
    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, genre);
        setReleaseYear(releaseYear);
        setRevenue(revenue);
        setRating(rating);
    }


    //action methods - play(), pause(), fastForward(), skipTo()
    public void edit() {
        Scissors snipper = new Scissors(); // if not public, movie wouldn't be able to see it (package level encapsulation)
        snipper.cut();
    }

    //accessor methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return String.format("Movie: title = %s, releaseYear = %s, revenue = %,.2f, rating = %s, genre = %s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

//        return "Movie: title = " + getTitle() + ", releaseYear = " + getReleaseYear() +
//                ", revenue = " + getRevenue() + ", rating = " + getRating() + ", genre = " + getGenre() + ".";
    }
}
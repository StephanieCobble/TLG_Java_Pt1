package net.flix;

class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Halloween", 1978, 750_000_000.0, Rating.R, Genre.HORROR);
        System.out.println(movie1);

        Movie movie2 = new Movie("Pokemon");
        System.out.println(movie2);

        Movie movie3 = new Movie("New Land", Genre.SCI_FI);
        System.out.println(movie3);

        System.out.println();

        for (Genre genre : Genre.values()) { // for each
            System.out.println(genre);
        }
    }
}
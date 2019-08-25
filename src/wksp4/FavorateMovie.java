package wksp4;

import java.util.StringTokenizer;

public class FavorateMovie {
    private String favouriteMovies = "The Avengers##Infinite War##End Game##Thor##Iron Man" +
            "//Spider Man//Far From Home//Hulk//One Piece";

    public boolean isFavourite(String movie) {
        return favouriteMovies.contains(movie);
    }

    public void printTokens(String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(favouriteMovies, delimiter);
        int counter = 0;
        while (tokenizer.hasMoreTokens()) {
            System.out.println(++counter + ". " + tokenizer.nextToken());
        }
    }

    public static void main(String[] args) {
        // construct a FavouriteMovie object
        FavorateMovie favorateMovie = new FavorateMovie();

        System.out.println(favorateMovie.isFavourite("Iron Man"));
        System.out.println(favorateMovie.isFavourite("Ted"));

        System.out.println("\n[Delimiter] #");
        favorateMovie.printTokens("#");
        System.out.println("\n[Delimiter] /");
        favorateMovie.printTokens("/");
        System.out.println("\n[Delimiter] #/");
        favorateMovie.printTokens("#/");
    }
}

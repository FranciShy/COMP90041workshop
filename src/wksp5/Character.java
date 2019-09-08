// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp5;

public class Character {
    private final String name;
    private final String actorName;
    // sometimes we don't want to set movie when construct it
    private Movie movie;

    public Character() {
        this.name = "Tony Stark";
        this.actorName = "Robert Downey Jr.";
    }

    public Character(String name, String actorName) {
        this.name = name;
        this.actorName = actorName;
    }

    // relate this instance to a movie instance
    public Character(String name, String actorName, Movie movie) {
        this(name, actorName);
        this.movie = movie;
    }

    @Override
    public String toString() {
        return name + "(played by " + actorName + ")";
    }

    public boolean equals(Character character) {
        if (!this.name.equals(character.name)) {
            return false;
        } else if (!this.actorName.equals(character.actorName)) {
            return false;
        } // what happens when we call character.movie
        else if (!this.movie.equals(character.movie)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getActorName() {
        return actorName;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}

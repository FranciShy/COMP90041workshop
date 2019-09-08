// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp5;

public class Movie {
    public static void main(String[] args) {
        Movie nobody = new Movie();
        System.out.println("Movie count: " + counter);
        System.out.println(nobody);

        System.out.println("Movie count: " + counter);
        Movie ironMan = new Movie("Iron Man", 1, 129);
        System.out.println(ironMan);
        System.out.println("Test Movie equals() with new Movie instance: "
                + ironMan.equals(new Movie("Iron Man", 1, 129)));
        System.out.println("Test Movis equals() with copy constructor: "
                + ironMan.equals(new Movie(ironMan)));
        // test major setting
        System.out.println();
        ironMan.setMajor(new Character("Tony Stark", "Robert Downey Jr."));
        System.out.println(ironMan.getMajor());
        System.out.println(ironMan);
    }
    // another way to initialize fields
    private static int counter; {
        counter = 0;
    }

    private String title;
    private int rank;
    private int minutes;
    private Character major;

    public Movie() {
        title = "Unnamed Movie";
        rank = 0;
        minutes = 0;
    }

    // construct a movie we want
    public Movie(String title, int rank, int minutes) {
        this.title = title;
        this.rank = rank;
        this.minutes = minutes;
        counter++;
    }

    public Movie(String title, int rank, int minutes, Character major) {
        this(title, rank, minutes);
        this.setMajor(major);
        // do we still need counter++
    }

    // copy constructor
    // shallow copy here?
    public Movie(Movie copy) {
        // why we have accesses to copy private fields?
        this.setTitle(copy.title);
        this.setRank(copy.getRank());
        this.minutes = copy.getMinutes();
        this.major = copy.major;
        counter++;
    }

    // util func
    @Override
    public String toString() {
        return "{\n\t[Movie] " + title + "\n\t[rank] " + rank
                + "\n\t[time] " + minutes + " minutes"
                + "\n\t[major] " + major + "\n}";
    }

    public boolean equals(Movie movie) {
        if (!this.title.equals(movie.title)) {
            return false;
        } else if (this.minutes != movie.minutes
                || this.rank != movie.getRank()) {
            return false;
        } else {
            return true;
        }
    }

    //***** get methods *****
    public static int getCounter() {
        return counter;
    }

    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public int getMinutes() {
        return minutes;
    }

    public Character getMajor() {
        return major;
    }

    // set methods only give fields need to update
    // can also change access modifier to package use
    //***** set methods *****
    public void setTitle(String title) {
        this.title = title;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setMajor(Character major) {
        this.major = major;
        // set the movie field in major
        major.setMovie(this);
    }
}

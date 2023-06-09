import java.util.Comparator;

public class Song implements Comparable<Song> {
    private String title;
    private String author;

    private String rating;
    private String bpm;

    public Song(String title, String author, String rating, String bpm) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.bpm = bpm;
    }

    public String rating() {
        return rating;
    }

    public Song setRating(String rating) {
        this.rating = rating;
        return this;
    }

    public String bpm() {
        return bpm;
    }

    public Song setBpm(String bpm) {
        this.bpm = bpm;
        return this;
    }

    public String title() {
        return title;
    }

    public Song setTitle(String title) {
        this.title = title;
        return this;
    }

    public String author() {
        return author;
    }

    public Song setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.title);
    }
}

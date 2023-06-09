import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox {
    ArrayList<Song> songArrayList = new ArrayList<>();

    public static void main(String[] args) {
        new JukeBox().go();
    }

    public void go() {
        getSongs();
        printSongList("Before sort");

//        Using Comparator.compare
//        Collections.sort(songArrayList, Comparator.comparing(Song::title));
//        Using Comparator implementation
//        ArtistCompare artistCompare = new ArtistCompare();
//        Collections.sort(songArrayList, artistCompare);

        Collections.sort(songArrayList);
        printSongList("After sort");
    }

    //Comparator implementation
    class ArtistCompare implements Comparator<Song>{

        @Override
        public int compare(Song o1, Song o2) {
            return o1.author().compareTo(o2.author());
        }
    }

    private void getSongs() {
        try {
            File file = new File("C:\\Users\\USER\\IdeaProjects\\Java Intern\\head-first-java-book-practice\\src\\main\\java\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private void addSong(String textLine) {
        String[] token = textLine.split("/");
        String title = token[0];
        String author = token[1];
        String rating = token[2];
        String bpm = token[3];
        Song song = new Song(title, author, rating, bpm);
        songArrayList.add(song);
    }

    private void printSongList(String textHeader) {
        System.out.println(textHeader);
        for (Song song:songArrayList) {
            System.out.println(song);
        }
        System.out.println();
    }
}

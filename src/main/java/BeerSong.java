public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
                System.out.println(beerNum + " " + word + " of beer.");
            } else {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            }
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
        } // end while loop
        System.out.println("No more bottles of beer on the wall");
    } // end main method
} // end class
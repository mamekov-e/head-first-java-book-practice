import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        int randomNum = (int)(Math.random() * 5);

        ArrayList<String> locations = new ArrayList<>();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum+1));
        locations.add(String.valueOf(randomNum+2));

        simpleDotCom.setLocationCells(locations);

        int numOfGuesses = 0;

        while (true) {
            String userGuess = GameHelper.getUserInput("Enter your number");
            String result = simpleDotCom.checkYourself(userGuess);
            System.out.println(result);
            numOfGuesses++;
            if ("kill".equals(result)) {
                System.out.println("You took " + numOfGuesses + " guesses");
                break;
            }
        }
    }
}

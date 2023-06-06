import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numsOfGuesses = 0;

    void setUpGame() {
        DotCom one = new DotCom("Pets.com");
        DotCom two = new DotCom("eToys.com");
        DotCom three = new DotCom("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter your number");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numsOfGuesses++;
        String result = "miss";

        for (DotCom dotCom : dotComList) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numsOfGuesses <= 18) {
            System.out.println("It only took you " + numsOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numsOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
}

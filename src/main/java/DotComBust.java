import java.util.ArrayList;

public class DotComBust {
    private ArrayList<String> locationCells;
//    int numOfHits;

    String checkYourself(String guess) {
        String result = "miss";

        System.out.println("locationCells "+ locationCells);
        int index = locationCells.indexOf(guess);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        return result;
    }

    void setLocationCells(ArrayList<String> cells) {
        locationCells = cells;
    }
}

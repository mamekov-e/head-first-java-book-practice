import java.util.ArrayList;

public class DotCom {
    private String name;
    private ArrayList<String> locationCells = new ArrayList<>();

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public DotCom(String name) {
        this.name = name;
    }

    public DotCom setName(String name) {
        this.name = name;
        return this;
    }

    public String name() {
        return name;
    }

    public DotCom setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
        return this;
    }
}

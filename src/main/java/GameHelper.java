import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public static String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + ": ");

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            inputLine = bf.readLine();
        } catch (IOException exception) {
            System.out.println(exception);
        }
        return inputLine;
    }
}

package deseriization;

import models.BoxTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("foo.ser");
            ObjectInputStream oi = new ObjectInputStream(fs);

            BoxTest box = (BoxTest) oi.readObject();
            System.out.println("Deserialized: " + box);
            oi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

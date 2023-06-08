package serialization;

import models.BoxTest;

import java.io.*;
public class SerializationTest {
    public static void main (String[] args) {
        BoxTest myBox = new BoxTest();
        myBox.setWidth(50);
        myBox.setHeight(20);
        try {
            // Serializes box's instance variable, 'cause it implements Serializable
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
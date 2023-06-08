package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable {
    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();
        try {
            FileOutputStream fs = new FileOutputStream("serialization.Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myPond);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

/*Class serialization.Pond has one instance
        variable, a serialization.Duck.
        When you serialize myPond (a serialization.Pond
        object), its serialization.Duck instance variable
        automatically gets serialized.

        But here since serialization.Duck is not implementing Serializable it will throw NotSerializableException
        */
class Duck {
    // duck code here
}
package serialization;

import java.io.Serializable;
import java.net.*;

public class TransientKeyWord {

}

/*Mark the instance variable with transient if there is need to skip it when serialize */
class Chat implements Serializable {
    transient String currentID;

    String userName;
    // more code
}

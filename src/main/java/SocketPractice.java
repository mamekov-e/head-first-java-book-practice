import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketPractice {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.22", 4242);

            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println("Some text");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceClient {

    String[] adviceList =  {"Take smaller bites",
            "Go for the tight jeans. No they do NOT make you look fat.",
            "One word: inappropriate",
            "Just for today, be honest. Tell your boss what you *really* think",
            "You might want to rethink that haircut."};

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket socket = serverSocket.accept();

                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                printWriter.println(advice);
                printWriter.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAdvice() {
        int randomAdviceNum = (int) (Math.random() * adviceList.length);
        return adviceList[randomAdviceNum];
    }

    public static void main(String[] args) {
        DailyAdviceClient adviceClient = new DailyAdviceClient();
        adviceClient.go();
    }


}

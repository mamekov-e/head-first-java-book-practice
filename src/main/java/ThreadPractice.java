public class ThreadPractice implements Runnable {

    public static void main(String[] args) {
        ThreadPractice obj = new ThreadPractice();
        Thread thread = new Thread(obj);

        thread.start();

        System.out.println("Main method");
    }

    @Override
    public void run() {
        System.out.println("New Thread method");
    }
}

class PrintThread extends Thread {
    private final String msg;
    PrintThread(String msg) { this.msg = msg; }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(msg + " - " + i);
            try { Thread.sleep(200); } catch (InterruptedException ignored) {}
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        PrintThread t1 = new PrintThread("Thread A");
        PrintThread t2 = new PrintThread("Thread B");
        t1.start();
        t2.start();
    }
}

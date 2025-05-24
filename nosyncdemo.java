class NoSyncThread extends Thread {
    String msg;

    public NoSyncThread(String a) {
        this.msg = a;  // assign constructor argument to instance variable
    }

    public static void DisplayMessage(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.print("]");
    }

    public void run() {
        DisplayMessage(msg);
    }
}

public class nosyncdemo {
    public static void main(String[] args) {
        NoSyncThread c1 = new NoSyncThread("1st task");
        NoSyncThread c2 = new NoSyncThread("2nd task");

        c1.start();
        c2.start();
    }
}

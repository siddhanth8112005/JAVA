class SyncThread extends Thread {
    String msg;

    public SyncThread(String a) {
        this.msg = a;  
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

public class synchdemo {
    public static void main(String[] args) {
        SyncThread c1 = new SyncThread("1st task");
        SyncThread c2 = new SyncThread("2nd task");

        c1.start();
        c2.start();
    }
}

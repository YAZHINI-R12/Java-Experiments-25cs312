class ReservationThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket reservation in progress - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class StatusThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket confirmation completed - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class exp08
    public static void main(String[] args) {
        ReservationThread reservation = new ReservationThread();
        StatusThread status = new StatusThread();
        Thread confirmation = new Thread(status);

        reservation.start();
        confirmation.start();
    }
}
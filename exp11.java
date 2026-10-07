class Printer {
    synchronized void printDocument() {
        System.out.println(Thread.currentThread().getName() + " is printing the document");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " has finished printing");
    }
}

class UserThread extends Thread {
    private Printer printer;

    UserThread(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }

    public void run() {
        System.out.println(getName() + " started");
        printer.printDocument();
        System.out.println(getName() + " terminated");
    }
}

public class exp11 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        UserThread thread1 = new UserThread(printer, "User 1");
        UserThread thread2 = new UserThread(printer, "User 2");

        System.out.println("Initial state of User 1: " + thread1.getState());

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Current state of User 1: " + thread1.getState());

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final state of User 1: " + thread1.getState());
        System.out.println("Deadlock prevention: Synchronization with a single shared lock prevents deadlock.");
    }
}

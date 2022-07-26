package hw1.fireDepartment;

public class MyThread implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("!!!Alarm is ringing!!!");
            notifyAll();
        }
    }
}

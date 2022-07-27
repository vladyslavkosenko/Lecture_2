package hw1.fireDepartment;

public class Main {
    private static final MyThread myThread = new MyThread();

    public static void main(String[] args) {

        Firefighter firefighter = new Firefighter("Jack");
        Firefighter firefighter1 = new Firefighter("Tom");
        Firefighter firefighter2 = new Firefighter("Cain");
        Main.myThread.run();
        synchronized (Main.myThread) {
            try {
                myThread.wait(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            firefighter.fightFire();
            firefighter1.fightFire();
            firefighter2.fightFire();
        }
    }
}
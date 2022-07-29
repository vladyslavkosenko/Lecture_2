package hw1.songBox;

public class Main {
    public static void main(String[] args) {
        JazzThread jazzThread = new JazzThread();
        ChansonThread chansonThread = new ChansonThread();
        AmbientThread ambientThread = new AmbientThread();
        RockThread rockThread = new RockThread();
        TechnoThread technoThread = new TechnoThread();
        jazzThread.run();
        chansonThread.run();
        ambientThread.run();
        rockThread.run();
        technoThread.run();
        CopyOnWriteArray.arrayList.forEach(System.out::println);

    }
}
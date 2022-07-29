package hw1.songBox;

import java.util.concurrent.CopyOnWriteArrayList;

public class TechnoThread implements Runnable {
    @Override
    public void run() {
        CopyOnWriteArrayList<String> arrayList = CopyOnWriteArray.arrayList;
        arrayList.add("Techno");

    }
}

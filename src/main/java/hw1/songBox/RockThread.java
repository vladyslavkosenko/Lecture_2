package hw1.songBox;

import java.util.concurrent.CopyOnWriteArrayList;

public class RockThread implements Runnable {
    @Override
    public void run() {
        int inc = 0;
        CopyOnWriteArrayList<String> arrayList = CopyOnWriteArray.arrayList;
        arrayList.add("Rock");
    }
}

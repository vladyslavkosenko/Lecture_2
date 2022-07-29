package hw1.songBox;

import java.util.concurrent.CopyOnWriteArrayList;

public class AmbientThread implements Runnable {
    @Override
    public void run() {
        CopyOnWriteArrayList<String> arrayList = CopyOnWriteArray.arrayList;
        arrayList.add("Ambient");
    }
}

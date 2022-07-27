package hw1.songBox;

import java.util.concurrent.CopyOnWriteArrayList;

public class JazzThread implements Runnable {

    @Override
    public void run() {
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArray().arrayList;
        arrayList.add("Jazz");
    }
}

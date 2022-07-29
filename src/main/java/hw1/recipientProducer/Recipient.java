package hw1.recipientProducer;

import java.util.List;

public class Recipient implements Runnable {
    private final List<String> list;

    public Recipient(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            list.set(0, "I process information");
        }
    }
}

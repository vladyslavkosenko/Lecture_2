package hw1.recipientProducer;

import java.util.List;

public class Producer implements Runnable {
    private final List<String> list;
    public Producer(List<String> list) {
        this.list = list;
    }
    @Override
    public void run() {
        synchronized (list) {
            list.add("I am sending information");
        }
    }
}

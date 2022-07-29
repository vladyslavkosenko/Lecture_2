package hw1.recipientProducer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        Producer producer = new Producer(list);
        Recipient recipient = new Recipient(list);
        producer.run();
        recipient.run();

        list.forEach(System.out::println);
    }
}

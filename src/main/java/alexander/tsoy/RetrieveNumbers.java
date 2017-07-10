package alexander.tsoy;

import java.util.PriorityQueue;

public class RetrieveNumbers {

    public static void Retrieve(PriorityQueue<Integer> storage) {
        Thread tt = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    synchronized (storage) {
                        if (storage.isEmpty()) {
                            System.out.println("no numbers to remove");
                        } else {
                            System.out.println(storage.poll());
                        }
                    }
                } catch (InterruptedException e) {
                }
            }
        });
        tt.start();
    }
}

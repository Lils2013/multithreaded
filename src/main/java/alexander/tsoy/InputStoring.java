package alexander.tsoy;

import java.io.InputStream;
import java.util.PriorityQueue;
import java.util.Scanner;

public class InputStoring {

    public static void input(InputStream in, PriorityQueue<Integer> storage) {
        Thread t = new Thread(() -> {
            System.out.println("Write your numbers:");
            Scanner scan = new Scanner(in);
            while (scan.hasNextLine()) {
                String input = scan.nextLine();
                int value = ProcessInput.processInput(input);
                synchronized (storage) {
                    storage.add(value);
                }
            }
        });
        t.start();
    }
}

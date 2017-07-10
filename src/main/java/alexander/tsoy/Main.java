package alexander.tsoy;

import java.util.*;

public class Main {

    private final PriorityQueue<Integer> storage = new PriorityQueue<>();

    public static void main(String[] args) {
        Main main = new Main();
        InputStoring.input(System.in,main.getStorage());
        RetrieveNumbers.Retrieve(main.getStorage());
    }

    public PriorityQueue<Integer> getStorage() {
        return storage;
    }
}

package alexander.tsoy;

import java.util.Objects;

public class ProcessInput {

    private static final String[] DIGITS = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TENS = new String[]{"twenty", "thirty", "forty", "fifty", "sixty", "seventy",
            "eighty", "ninety"};
    private static final String[] TEENS = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"};

    public static Integer processInput(String input) {
        String[] split = input.trim().split(" ");
        int result = 0;
        if (Objects.equals(input, "zero")) {
            return result;
        }
        if (input.contains("thousand")) {
            int temp1 = 0;
            int temp2 = 0;
            for (int i1 = 0; i1 < DIGITS.length; i1++) {
                if (Objects.equals(split[0], DIGITS[i1])) {
                    temp2 = 1000*(i1 + 1);
                }
            }
            temp1 = processHundreds(split, 2);
            result = temp1 + temp2;
        } else {
            result = processHundreds(split, 0);
        }
        return result;
    }

    private static Integer processHundreds(String[] split, int start) {
        int temp = 0;
        outer:
        for (int i = start; i < split.length; i++) {
            for (int i1 = 0; i1 < DIGITS.length; i1++) {
                if (Objects.equals(split[i], DIGITS[i1])) {
                    temp += i1 + 1;
                    continue outer;
                }
            }
            if (Objects.equals(split[i], "hundred")) {
                temp *= 100;
                continue outer;
            }
            for (int i1 = 0; i1 < TENS.length; i1++) {
                if (Objects.equals(split[i], TENS[i1])) {
                    temp += (i1+2)*10;
                    continue outer;
                }
            }
            for (int i1 = 0; i1 < TEENS.length; i1++) {
                if (Objects.equals(split[i], TEENS[i1])) {
                    temp += i1 + 10;
                    continue outer;
                }
            }
        }
        return temp;
    }
}

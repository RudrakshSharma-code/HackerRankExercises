import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.stream.Collectors.*;

class Solution {
    public static void plusMinus(List<Integer> arr) {
        double divisor = arr.size();
        double negatives = 0;
        double positives = 0;
        double zeroes = 0;

        for (int a : arr) {
            if (a > 0) {
                positives++;
            } else if (a == 0) {
                zeroes++;
            } else if (a < 0) {
                negatives++;
            }
        }

        System.out.println(positives / divisor);
        System.out.println(negatives / divisor);
        System.out.println(zeroes / divisor);
    }
}

public class PlusMinus {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 2, 3, -1, -2, -3, 0, 0);

        Solution.plusMinus(arr);
    }
}

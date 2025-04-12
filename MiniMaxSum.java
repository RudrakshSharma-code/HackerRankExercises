import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> maxArr = arr.subList(1, arr.size());
        List<Integer> minArr = arr.subList(0, arr.size() - 1);
        Long max = maxArr.stream().mapToLong(x -> Integer.toUnsignedLong(x)).reduce(0, (x, y) -> x + y);
        Long min = minArr.stream().mapToLong(x -> Integer.toUnsignedLong(x)).reduce(0, (x, y) -> x + y);
        System.out.println(min + " " + max);
    }
}

public class MiniMaxSum {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(7, 69, 2, 221, 8974);

        Solution.miniMaxSum(arr);
    }
}

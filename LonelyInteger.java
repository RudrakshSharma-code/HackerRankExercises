import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Solution {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> map = new HashSet<Integer>();

        for (Integer i : a) {
            if (map.contains(i)) {
                map.remove(i);
            } else {
                map.add(i);
            }
        }
        int i = (int) map.stream().findFirst().get();
        return i;
    }
}

public class LonelyInteger {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(84, 48, 13, 20, 61, 20, 33, 97, 34, 45, 6, 63, 71,
                66, 24, 57, 92, 74, 6, 25, 51, 86, 48, 15, 64, 55, 77, 30, 56, 53, 37, 99, 9, 59, 57, 61,
                30, 97, 50, 63, 59, 62, 39, 32, 34, 4, 96, 51, 8, 86, 10, 62, 16, 55, 81, 88, 71, 25, 27,
                78, 79, 88, 92, 50, 16, 8, 67, 82, 67, 37, 84, 3, 33, 4, 78, 98, 39, 64, 98, 94, 24, 82,
                45, 3, 53, 74, 96, 9, 10, 94, 13, 79, 15, 27, 56, 66, 32, 81, 77);

        int result = Solution.lonelyinteger(arr);
        System.out.println(result);
    }
}

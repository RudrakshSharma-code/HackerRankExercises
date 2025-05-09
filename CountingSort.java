import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> hundred = IntStream.range(0, 100).boxed().collect(Collectors.toList());
        for (Integer i : hundred) {
            map.put(i, 0);
        }
        for (Integer i : arr) {
            if (hundred.contains(i)) {
                Integer add = (Integer) map.get(i);
                add++;
                map.put(i, add);
            }
        }
        List<Integer> list = new ArrayList<Integer>(map.values());
        return list;
    }

}

public class CountingSort {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(63, 54, 17, 78, 43, 70, 32, 97, 16, 94, 74,
                18, 60, 61, 35, 83, 13, 56, 75, 52, 70, 12, 24, 37, 17, 0, 16, 64, 34, 81, 82, 24,
                69, 2, 30, 61, 83, 37, 97, 16, 70, 53, 0, 61, 12, 17, 97, 67, 33, 30, 49, 70, 11,
                40, 67, 94, 84, 60, 35, 58, 19, 81, 16, 14, 68, 46, 42, 81, 75, 87, 13, 84, 33, 34, 14, 96, 7, 59, 17,
                98, 79, 47, 71, 75, 8, 27, 73, 66, 64, 12, 29, 35, 80, 78, 80, 6, 5, 24, 49, 82);

        String result = Result.countingSort(arr).stream().map(Object::toString)
                .flatMap(s -> Stream.of(s.split("")))
                .collect(Collectors.joining(", "));
        
        System.out.print(result);

    }
}

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
    public static String timeConversion(String s) {
        String initialString = s.substring(0, 2);
        String rest = s.substring(2, 8);
        String sign = s.substring(8, s.length());
        String result = "";
        if (sign.equals("PM") && !initialString.equals("12")) {
            Integer initialInt = Integer.parseInt(initialString) + 12;
            result = initialInt.toString() + rest;
        } else if (sign.equals("AM") && initialString.equals("12")) {
            result = "00" + rest;
        } else {
            result = initialString + rest;
        }
        return result;
    }
}

public class TimeConversion {
    public static void main(String[] args) {

        String s = "11:59:59PM";

        String result = Solution.timeConversion(s);
        System.out.println(result);
    }
}
